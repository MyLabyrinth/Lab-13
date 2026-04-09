// ============================================
// TASK 1: PACKAGES - Import required packages here
// TODO: Import HashSet from java.util
// TODO: Import LinkedList from java.util
// TODO: Import ArrayBlockingQueue from java.util.concurrent
// TODO: Import Scanner from java.util
// ============================================



// Main class - entry point of the program
public class Lab13 {
    
    public static void main(String[] args) {
        
        // Create Scanner for user input
        // TODO: Create a Scanner object to read from System.in
        
        
        // ============================================
        // TASK 1: TREASURE HUNT - UNIQUE ITEMS COLLECTED
        // ============================================
        
        System.out.println("=== TASK 1: Treasure Hunt - Item Collection ===\n");
        
        // TODO: Create a HashSet<String> called collectedTreasure
        
        
        // TODO: Add these 5 starting items using .add():
        // "Gold Coin"
        // "Ancient Scroll"
        // "Diamond Ring"
        // "Gold Coin" (duplicate - will be ignored)
        // "Silver Amulet"
        
        
        
        
        
        
        System.out.println("--- Items in Your Collection ---");
        
        // TODO: Display collected items
        // Hint: You can use enhanced for-each loop with HashSet
        for (String _________________ : _________________) {
            System.out.println("  * " + _________________);
        }
        
        System.out.println("\nUnique items collected: " + collectedTreasure._________________());
        System.out.println();
        
        // TODO: Ask user if they found a new item
        System.out.print("Did you find a new item? (y/n): ");
        String foundItem = scanner.nextLine().toLowerCase();
        
        if (foundItem.equals("y")) {
            // TODO: Ask for the item name
            System.out.print("Item name: ");
            String itemName = scanner.nextLine();
            
            // TODO: Use .add() to add the item
            boolean isNew = collectedTreasure._________________(itemName);
            
            if (isNew) {
                System.out.println("✓ Added: " + itemName + " to collection!");
            } else {
                System.out.println("Already have this: " + itemName);
            }
        }
        
        System.out.println();
        
        // TODO: Ask if they want to check for a specific item
        System.out.print("Check if you have an item? (y/n): ");
        String checkItem = scanner.nextLine().toLowerCase();
        
        if (checkItem.equals("y")) {
            System.out.print("Item name to search: ");
            String searchItem = scanner.nextLine();
            
            // TODO: Use .contains() to check if item exists
            if (collectedTreasure.___________________(searchItem)) {
                System.out.println("✓ You have: " + searchItem);
            } else {
                System.out.println("✗ You don't have: " + searchItem);
            }
        }
        
        System.out.println();
        System.out.println("--- Final Treasure Collection ---");
        
        // TODO: Display final collection
        for (String _________________ : _________________) {
            System.out.println("  * " + _________________);
        }
        
        System.out.println("\nTotal unique treasures: " + collectedTreasure._________________());
        System.out.println("\n\n");
        
        
        // ============================================
        // TASK 2: CUSTOMER SUPPORT TICKET QUEUE
        // ============================================
        
        System.out.println("=== TASK 2: Customer Support Ticket Queue ===\n");
        
        // TODO: Create an ArrayBlockingQueue<String> with capacity 8 called ticketQueue
        
        
        // TODO: Add these 3 starting tickets using .offer():
        // "Ticket #101: Password reset issue"
        // "Ticket #102: Payment failed"
        // "Ticket #103: App crashing"
        
        
        
        
        
        System.out.println("--- Current Support Tickets ---");
        
        // TODO: Display the ticket queue with numbering using enhanced for-each loop
        int ticketNum = 1;
        for (String _________________ : _________________) {
            System.out.println("  " + ticketNum + ". " + _________________);
            ticketNum++;
        }
        
        System.out.println("\nTickets in queue: " + ticketQueue._________________());
        System.out.println();
        
        // TODO: Simulate support agent processing a ticket
        System.out.println("⚙️  SUPPORT AGENT PROCESSING...");
        String processedTicket = ticketQueue._________________();
        if (processedTicket != null) {
            System.out.println("✓ Resolved: " + processedTicket);
        }
        
        System.out.println();
        
        // TODO: Ask if a new customer support ticket is incoming
        System.out.print("New customer ticket incoming? (y/n): ");
        String newTicket = scanner.nextLine().toLowerCase();
        
        if (newTicket.equals("y")) {
            // TODO: Ask for ticket details
            System.out.print("Issue description: ");
            String issue = scanner.nextLine();
            
            // TODO: Ask if it's URGENT/PRIORITY
            System.out.print("Is this URGENT? (y/n): ");
            String isUrgent = scanner.nextLine().toLowerCase();
            
            String fullTicket;
            if (isUrgent.equals("y")) {
                // TODO: Create ticket with PRIORITY tag
                fullTicket = "🔴 URGENT - " + issue;
                System.out.println("⚠️  Added URGENT ticket to front!");
            } else {
                // TODO: Create ticket with regular tag
                fullTicket = "🟡 NORMAL - " + issue;
                System.out.println("✓ Added regular ticket to queue!");
            }
            
            // TODO: Use .offer() to add the ticket
            ticketQueue.___________________(fullTicket);
        }
        
        System.out.println();
        System.out.println("--- Updated Support Queue ---");
        
        // TODO: Display updated queue with numbering
        int updatedNum = 1;
        for (String _________________ : _________________) {
            System.out.println("  " + updatedNum + ". " + _________________);
            updatedNum++;
        }
        
        System.out.println("\nRemaining tickets: " + ticketQueue._________________());
        
        // TODO: Close the scanner
        
    }
}


// ============================================
// HASHSET METHODS REFERENCE
// ============================================

/*
 * Basic Methods:
 * .add(element)           - Add element, returns true if new, false if duplicate
 * .remove(element)        - Remove specific element
 * .contains(element)      - Check if element exists (true/false)
 * .size()                 - Get number of unique elements
 * .isEmpty()              - Check if set is empty
 * .clear()                - Remove all elements
 * 
 * Why use HashSet?
 * - Automatically prevents duplicates
 * - Fast lookup with .contains() - O(1) average
 * - Order doesn't matter (unordered collection)
 * - Perfect for checking membership
 */


// ============================================
// ARRAYBLOCKINGQUEUE METHODS REFERENCE
// ============================================

/*
 * Basic Methods:
 * .offer(element)         - Add element, returns true if added, false if queue full
 * .poll()                 - Remove and return first element, null if empty
 * .peek()                 - View first element without removing, null if empty
 * .size()                 - Get number of elements currently in queue
 * .isEmpty()              - Check if queue is empty
 * 
 * LinkedList for comparison:
 * .addFirst()             - Add to beginning (efficient)
 * .addLast()              - Add to end (efficient)
 * .removeFirst()          - Remove from beginning (efficient)
 * 
 * Why use ArrayBlockingQueue?
 * - Thread-safe for multiple threads
 * - Fixed capacity (doesn't grow infinitely)
 * - Blocking behavior for coordination
 * - Perfect for producer-consumer patterns
 */