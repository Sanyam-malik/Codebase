import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestCaseValidator {

    public static final String COMPILE_CMD = "javac";
    public static final String RUN_CMD = "java";

    private String packageName = "";
    private String fileName = "";
    private List<String> args = new ArrayList<>();

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getArgs() {
        return this.args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public TestCaseValidator() {
    }

    public TestCaseValidator(String packageName, String fileName) {
        this.packageName = packageName;
        this.fileName = fileName;
    }

    public void compileAndRun() {
        try {
            // Compile the Java program
            String compileOutput = compileProgram();
            System.out.println("Compilation output:\n" + compileOutput);

            if (!compileOutput.equalsIgnoreCase("success")) {
                return;
            }

            // Run the Java program
            String runOutput = runProgram();
            System.out.println("Execution output:\n" + runOutput);
        } finally {
            deleteFile(this.packageName + "/" + this.fileName + ".class");
        }
    }

    public static void main(String[] args) {
        TestCaseValidator tv = new TestCaseValidator();
        tv.setPackageName("Stacks");
        tv.setFileName("ImplementQueue");
        tv.compileAndRun();
    }

    private String compileProgram() {
        String programSource = this.packageName + "/" + this.fileName + ".java";
        ProcessBuilder compileProcessBuilder = new ProcessBuilder();
        compileProcessBuilder.command(COMPILE_CMD, programSource);

        StringBuilder output = new StringBuilder("success");

        try {
            Process compileProcess = compileProcessBuilder.start();
            int exitCode = compileProcess.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(compileProcess.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            if (exitCode != 0) {
                output.append("Compilation failed");
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            output.append(e.toString());
        }
        return output.toString();
    }

    private String runProgram() {
        String programClass = this.packageName + "/" + this.fileName;
        ProcessBuilder runProcessBuilder = new ProcessBuilder();
        runProcessBuilder.command(RUN_CMD, programClass);
        runProcessBuilder.command().addAll(this.args);

        StringBuilder output = new StringBuilder();

        try {
            Process runProcess = runProcessBuilder.start();
            int exitCode = runProcess.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            // Print the exit code
            output.append("Exit Code: ").append(exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            output.append(e.toString());
        }
        return output.toString();
    }

    private static void deleteFile(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            Files.deleteIfExists(filePath);
            System.out.println("File deleted: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
