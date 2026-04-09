# Lab 13

## Recap: Lab (Github) Workflow 📄 - How to Work on Labs
Follow these steps for every lab carefully to access, complete, and submit your assignment.
1.  **Accept the Assignment**
    - Open the Lab Assignment Link the professor provided.
    - Click **"Accept the assignment"**. This will create your personal assignment repository on GitHub under organization.
    - You'll be taken to your repository page. Verify that the URL.
2.  **Clone the Repository to Your Computer**
    - On your repository page, click the blue **`<> Code`** button.
    - In the dropdown menu, choose **"Open with GitHub Desktop"**.
    - GitHub Desktop will launch. Choose a preferred local folder on your computer to save the project and click **"Clone"**.
    - If asked "How are you planning on using this fork?", select **"For my own purpose"** and continue.
3.  **Open in VS Code and Start Coding**
    - In GitHub Desktop, ensure the "Current repository" is the one for this lab.
    - Click the **"Open in Visual Studio Code"** button.
    - VS Code will open the project folder. You can now begin writing your solutions in the `Lab13.java` file.
4.  **Save and Submit Your Work**
    - **Commit (Save) Changes**: As you work, save your file in VS Code (`Ctrl+S` or `Cmd+S`). To record your progress, go to the **Source Control** tab (the fork icon) on the left sidebar in VS Code. Type a descriptive message in the message box (e.g., "Finished Task 1 and 2") and click **"Commit"**. You must enter a message.
    - **Push (Submit) to GitHub**: When you are finished with the lab or want to back up your work, go back to GitHub Desktop. Click the **"Push origin"** button at the top of the window. This sends your committed changes from your computer to your GitHub repository online.
5.  **Verify Your Submission**
    - After you push, you can click **"View on GitHub"** in GitHub Desktop to open your repository in the browser.
    - On the GitHub website, make sure you are viewing the `main` branch and confirm that all of your latest code is visible.

---

## Lab 13 Tasks

### Collections Framework: HashSet & ArrayBlockingQueue

_Using HashSet for unique data and ArrayBlockingQueue for thread-safe queuing_

---

## Task 1: Treasure Hunt - Item Collection 🎮

**Topics Covered:** HashSet `.add()`, `.contains()`, `.size()`, enhanced for-each loop, boolean return values

**What This Task Practices:** You'll use HashSet to manage a treasure collection where duplicate items are automatically prevented. Perfect for tracking unique items in an adventure game!

### What You'll Do

**Part 1: Create HashSet and Add Starting Treasures**

- Create a `HashSet<String>` called `collectedTreasure`
- Add 5 items (including one duplicate) using `.add()`:
  - "Gold Coin"
  - "Ancient Scroll"
  - "Diamond Ring"
  - "Gold Coin" (duplicate - will be ignored automatically!)
  - "Silver Amulet"

**Part 2: Display Current Collection**

- Use enhanced for-each loop: `for (String item : collectedTreasure)`
- Display each item with a symbol
- Print total unique items using `.size()`
- Note: HashSet will only have 4 items (the duplicate is ignored)

**Part 3: Search for and Add New Items**

- Ask user if they found a new item (y/n)
- If yes, get the item name from user
- Use `.add()` which returns `true` if item is new, `false` if duplicate
- Display appropriate message based on return value

**Part 4: Check Inventory**

- Ask user if they want to check for a specific item (y/n)
- If yes, get item name to search
- Use `.contains()` to check if item exists
- Display whether item is in collection

**Part 5: Display Final Collection**

- Display all items in final collection
- Show total unique treasures

### Example Output

```
=== TASK 1: Treasure Hunt - Item Collection ===

--- Items in Your Collection ---
  * Gold Coin
  * Ancient Scroll
  * Diamond Ring
  * Silver Amulet

Unique items collected: 4

Did you find a new item? (y/n): y
Item name: Emerald Necklace
✓ Added: Emerald Necklace to collection!

Check if you have an item? (y/n): y
Item name to search: Gold Coin
✓ You have: Gold Coin

--- Final Treasure Collection ---
  * Gold Coin
  * Ancient Scroll
  * Diamond Ring
  * Silver Amulet
  * Emerald Necklace

Total unique treasures: 5
```

### Key Methods

| Method          | What It Does                              | Example                           |
| --------------- | ----------------------------------------- | --------------------------------- |
| `.add(item)`    | Add item, returns true if new, false if duplicate | `boolean isNew = treasure.add("Ring")` |
| `.contains(item)` | Check if item exists (true/false)       | `if (treasure.contains("Gold Coin"))` |
| `.size()`       | Get number of unique items                | `int count = treasure.size()`    |
| `.remove(item)` | Remove specific item                      | `treasure.remove("Gold Coin")`   |
| Enhanced for    | Loop through all items (order random)    | `for (String item : treasure)`   |

---

## Task 2: Customer Support Ticket Queue 🏢

**Topics Covered:** ArrayBlockingQueue `.offer()`, `.poll()`, `.size()`, iteration, fixed capacity

**What This Task Practices:** You'll build a customer support ticket system using ArrayBlockingQueue to manage incoming tickets in a first-come-first-served manner. This simulates how real support systems handle customer requests!

### What You'll Do

**Part 1: Initialize the Ticket Queue**

- Create an `ArrayBlockingQueue<String>` with capacity 8 called `ticketQueue`
- Use `.offer()` to add 3 starting tickets:
  - "Ticket #101: Password reset issue"
  - "Ticket #102: Payment failed"
  - "Ticket #103: App crashing"
- Display the current queue with numbering

**Part 2: Process a Ticket**

- Show first ticket in queue (using `.peek()` or viewing it)
- Use `.poll()` to remove and process the first ticket (support agent resolves it)
- Display what ticket was resolved
- Show remaining tickets in queue

**Part 3: Receive New Ticket**

- Ask user if new customer ticket is incoming (y/n)
- If yes, ask for issue description
- Ask if ticket is URGENT (y/n)
  - YES: Mark with 🔴 URGENT tag
  - NO: Mark with 🟡 NORMAL tag
- Use `.offer()` to add the ticket to queue
- Display confirmation message

**Part 4: Display Updated Queue**

- Display all remaining tickets with numbering
- Count total tickets remaining
- Show that queue is processing tickets in order

### Example Output

```
=== TASK 2: Customer Support Ticket Queue ===

--- Current Support Tickets ---
  1. Ticket #101: Password reset issue
  2. Ticket #102: Payment failed
  3. Ticket #103: App crashing

Tickets in queue: 3

⚙️  SUPPORT AGENT PROCESSING...
✓ Resolved: Ticket #101: Password reset issue

New customer ticket incoming? (y/n): y
Issue description: Account locked
Is this URGENT? (y/n): n
✓ Added regular ticket to queue!

--- Updated Support Queue ---
  1. Ticket #102: Payment failed
  2. Ticket #103: App crashing
  3. 🟡 NORMAL - Account locked

Remaining tickets: 3
```

### Key Methods

| Method          | What It Does                     | Example                             |
| --------------- | -------------------------------- | ----------------------------------- |
| `.offer(item)`  | Add item, returns true/false     | `ticketQueue.offer("Ticket #104")`  |
| `.poll()`       | Remove & return first item, null if empty | `String ticket = ticketQueue.poll()` |
| `.peek()`       | View first item without removing | `String next = ticketQueue.peek()`  |
| `.size()`       | Get number of items in queue     | `int count = ticketQueue.size()`    |
| `.isEmpty()`    | Check if queue is empty          | `if (ticketQueue.isEmpty())`        |
| Enhanced for    | Loop through all tickets         | `for (String ticket : ticketQueue)` |

---

## Important Patterns

### Creating HashSet

```java
HashSet<String> mySet = new HashSet<>();
```

### Adding to HashSet (with duplicate prevention)

```java
// Returns true if item is new, false if duplicate
boolean isNew = mySet.add("item");

if (isNew) {
    System.out.println("New item added!");
} else {
    System.out.println("Already have this item!");
}
```

### Checking Membership

```java
// Check if item exists (very fast!)
if (mySet.contains("item")) {
    System.out.println("Found it!");
}
```

### Creating ArrayBlockingQueue

```java
// Queue with capacity 10
ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
```

### Adding and Removing from Queue

```java
// Add to queue (non-blocking)
queue.offer("item");

// Remove from queue (null if empty)
String item = queue.poll();

// View without removing (null if empty)
String next = queue.peek();
```

### Iterating Through Collections

```java
// HashSet (order is unpredictable)
for (String item : mySet) {
    System.out.println(item);
}

// ArrayBlockingQueue (FIFO order)
for (String item : queue) {
    System.out.println(item);
}
```

---

## HashSet vs ArrayList for Duplicates

| Scenario | Use This | Why |
| -------- | -------- | --- |
| Need unique values only | HashSet | Automatically prevents duplicates |
| Allow duplicates, care about order | ArrayList | Keeps all items in insertion order |
| Need fast membership check | HashSet | `.contains()` is O(1) vs O(n) for ArrayList |
| Need to index items | ArrayList | HashSet has no index access |

---

## ArrayBlockingQueue vs LinkedList

| Feature | LinkedList | ArrayBlockingQueue |
| ------- | ---------- | ------------------ |
| Thread-safe | No | Yes |
| Fixed capacity | No (grows as needed) | Yes (set on creation) |
| Multi-thread coordination | No | Yes (blocking behavior) |
| `.offer()` method | No | Yes |
| `.poll()` method | No | Yes |
| Best for | Single-threaded, flexible size | Producer-consumer, thread-safe |

---

## Common Mistakes

| ❌ Wrong                            | ✅ Fix                                       |
| ----------------------------------- | -------------------------------------------- |
| `HashSet<String> set = new ArrayList<>();` | `HashSet<String> set = new HashSet<>();` |
| Checking duplicates manually | Let HashSet do it automatically with `.add()` |
| `set.get(0)` on HashSet             | Use enhanced for-each or `.contains()` |
| Forgetting `.poll()` returns null   | Check `if (item != null)` before using |
| Using `.offer()` on ArrayList       | Only for ArrayBlockingQueue! |
| Creating queue with no capacity     | Always specify: `new ArrayBlockingQueue<>(size)` |

---


## Need Help?

Ask instructor! Reference materials available:

- Lecture 13 materials
- HashSet documentation at `java.util.HashSet`
- ArrayBlockingQueue documentation at `java.util.concurrent.ArrayBlockingQueue`

## Finished?

When done with the lab (committed and pushed on GitHub), show instructor and state your name to be marked as done!

---

## Bonus: Extensions (If You Finish Early)

### Extension 1: Duplicate Detection

In Task 1, track how many times a duplicate item was found. Keep a separate counter that increments each time `.add()` returns false.

### Extension 2: Queue Statistics

In Task 2, track total tickets processed so far and calculate average time in queue. Display statistics at the end.

### Extension 3: VIP Tickets

Create a priority system where URGENT tickets are handled separately from normal tickets. You could use two queues or simulate priority by showing URGENT tickets first!

Good luck! 🎮🏢
