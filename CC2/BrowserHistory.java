class Node {
    String pageName;
    Node next;
    Node prev;

    public Node(String pageName) {
        this.pageName = pageName;
        this.next = null;
        this.prev = null;
    }
}


class DoublyLinkedList {
    private Node current;

    public DoublyLinkedList() {
        current = null;
    }

    //create a new page
    public void visitPage(String pageName) {
    Node newPage = new Node(pageName);

        if (current == null) {
            current = newPage;
        } else {
            //fclearing forward history
            current.next = null;

            newPage.prev = current;
            current.next = newPage;
            
            current = newPage;
        }

    System.out.println("Visited: " + pageName);
    }


    public void goBack() {
        if (current != null && current.prev == null) {
            current = current.prev;
            System.out.println("Went back to: " + current.pageName);
        } else {
            System.out.println("No previous page to go back to.");
        }
    }


    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Went forward to: " + current.pageName);
        } else {
            System.out.println("No forward page.");
        }
    }

}

public class BrowserHistory {
    public static void main(String[] args) {

        DoublyLinkedList BrowserHistory = new DoublyLinkedList();

        BrowserHistory.visitPage("google.com");
        BrowserHistory.visitPage("stackoverflow.com");
        BrowserHistory.visitPage("github.com");
    }
} 



