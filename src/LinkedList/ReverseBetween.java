package LinkedList;

import java.util.List;

/*
 * <metadata>
 * <name>Reverse Linked List II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseLLII.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/reverse-linked-list-ii/description/</url>
 * <date>2024-05-08</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/oDL8vuu2Q0E?si=X7BEdMpBiQ83-bOm&amp;start=1106" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>Good Question</remarks>
 * <companies>Ola:TCS:ION:IBM:Dell:Dunzo:Gojek:Adobe:Paytm:Cisco:Lumiq:Xperi:Nykaa:Park+:Wipro:Apple:Paypal:Oracle:Intuit:Myntra:Spinny:Adidas:JUSPAY:RedBus:Airtel:Amdocs:Rupeek:DeltaX:Forfit:Auzmor:Vocera:Amazon:Google:Samsung:Infosys:Gartner:Cashify:BirdEye:Coforge:Virtusa:Kulizaa:Fujitsu:Nagarro:Grappus:Netlink:Chaayos:Flipkart:Qualcomm:Lenskart:SAP Labs:Accolite:Conduent:MobiKwik:Infoedge:Hashedin:TravClan:Mindtree:Synopsys:Facebook:Cognizant:OLX Group:Capgemini:Delhivery:Mathworks:yellow.ai:Recrosoft:Delloitte:Blackrock:Microsoft:Freshworks:Innovaccer:Salesforce:Intel Labs:Bloomreach:Milkbasket:Allscripts:Microfocus:MakeMyTrip:BlackNgreen:Evalueserve:Tekion Corp:Incedo Inc.:1218 Global:Digital 1×1:ThoughtSpot:Quadrical AI:Schlumberger:Pristyn Care:Global Logic:ZS Associates:Natwest Group:Netcore cloud:Credit Suisse:Josh Software:DE Shaw India:Stigentech IT:Cloud Analogy:Exotel Techcom:Bank Of America:Larsen & Toubro:Newgen Software:Shrine Software:Publicis Sapient:General Electric:HCL Technologies:Adverb Solutions:Texas Instruments:HCODE Technologies:Rootstock Software:UnitedHealth Group:Tredence Analytics:Aditya Technologies:NetApp India Pvt Ltd:TIBCO Software India:Liberin Technologies:Hexaware Technologies:Indus Valley Partners:Unthinkable Solutions:Royal Bank of Scotland:Surya Software Systems:WatchGuard Technologies:Reliance Jio Infocomm Ltd:Sterlite Technologies Limited</companies>
 * </metadata>
 * */
public class ReverseBetween {

    static ListNode head = null;

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


    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;

        for (int i = 0; i < right - left; ++i) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }

    public static int findlength(ListNode head) {
        int size=0;
        ListNode currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }
        return size;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListNode currNode = head;
        for(int i: list) {
            ListNode n = new ListNode(i);
            if(head != null) {
                currNode.next = n;
                currNode = n;
            } else {
                head = n;
                currNode = head;
            }
        }
        head = reverseBetween(head, 2, 4);
    }

}

