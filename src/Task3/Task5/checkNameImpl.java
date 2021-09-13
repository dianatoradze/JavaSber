package Task3.Task5;
// второй способ проверки игроков checkName

class checkName  {
    static int count;
    static int points;

    checkName(String name) {
    }

    static class Node {

        protected String info;
        protected Node next;

        public Node(String value) {
            info = value;
            next = null;

        }
    }

    static class LinkedList {
        public static Node head;

        public LinkedList() {
            head = null;

        }
        public void checker(String name) {

            int nameExist = 0;
            for (checkName.Node cur = head; cur != null; cur = cur.next) {
                if (cur.info.equals(name)) {
                    nameExist++;
                }
            }
            if (nameExist > 0) {
                count += points;

                System.out.print("Сумма баллов игрока" + count);
            } else {
                System.out.print("some gamers");
            }
        }

    }
}
