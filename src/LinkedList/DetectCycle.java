package LinkedList;

/*
 * <metadata>
 * <name>Linked List Cycle</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/DetectCycle.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/linked-list-cycle/description/</url>
 * <date>2024-05-21</date>
 * <level>Easy</level>
 * <notes>Fast and Slow Pointers</notes>
 * <remarks>Good Question</remarks>
 * <companies>OYO:TCS:Ola:Hike:Visa:Grab:HSBC:FICO:KPMG:CRED:Nike:Paytm:Adobe:Dunzo:Quikr:Groww:Cisco:Park+:WinZO:Amazon:VMWare:Oracle:Google:RIVIGO:Swiggy:Paypal:Thales:Amdocs:Adidas:RedBus:Spinny:Rapido:Samsung:DE Shaw:Walmart:Veritas:Lybrate:Spotify:Siemens:Protium:Rakuten:Infosys:Globant:Nagarro:99acres:BirdEye:Nagaaro:Chaayos:Accolite:Snapdeal:SAP Labs:Qualcomm:Barclays:Phone Pe:Hedonova:MobiKwik:HashedIn:Verifone:Osmosiss:Synopsys:Coinbase:Cloudera:Microsoft:Cognizant:Capgemini:Delhivery:Accenture:FourKites:Tata Cliq:Bloomberg:MX Player:Blackrock:MakeMyTrip:BNY Mellon:Salesforce:Freshworks:Born group:MindTickle:Wells Fargo:Informatica:Pegasystems:Ion Trading:Tekion Corp:Magicbricks:Bristlecone:F5 Networks:Shell india:Green apple:MAQ Software:EPAM Systems:Athenahealth:SLK SOFTWARE:Deutsche Bank:Goldman Sachs:Natwest Group:Expedia Group:Urban Company:Bharti Airtel:Morgan Stanley:Mahindra Comviva:American Express:Publicis Sapient:Rudder Analytics:Juniper Networks:Valuefy Solutions:Persistent Systems:Antino Labs Pvt Ltd:NetApp India Pvt Ltd:Symphony Talent, LLC:Wheelseye Technology:Indus Valley Partners:Hexaview Technologies:Unthinkable Solutions:Jio Platforms Limited:42gearMobilitySystems:Cadence Design Systems:Veridic Private Limited:Cleartrail Technologies:Truminds Software Systems:Nippon Audiotronix limited:Accion Labs Private Limited:Velocity Software Pvt. Ltd.:Oodles Technologies Pvt Ltd:Aricent Technologies Limited:Providence Global Center LLP:Sterlite Technologies Limited:MINDZITA (OPC) PRIVATE LIMITED:Strategic IP Information Pte Ltd.:John Deere India Pvt. Ltd. (JDTCI):Happiest Minds Technologies Limited:IEO MAKERS FABLAB (OPC) PRIVATE LIMITED:Thoughts2Binary Consulting and Solutions</companies>
 * </metadata>
 * */
public class DetectCycle {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
