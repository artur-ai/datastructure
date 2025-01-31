package main.com.maiboroda.list;

public class ArrayList implements List {
        ArrayList list = new ArrayList();
        @Override
        public void add(Object value) {

            list.add("A");
            list.add("B");
            list.add("C");


        }

        @Override
        public void add(Object value, int index) {
            list.add("A", 0);
            list.add("B", 1);
            list.add("C", 2);
        }

        @Override
        public Object remove(int index) {
            list.add("A");
            list.add("B");
            list.add("C");
            list.remove(0);
            return null;
        }

        @Override
        public Object get(int index) {
            list.add("Java");
            list.add("C++");
            list.add("Python");
            Object language = list.get(0);
            System.out.println(language);
            return null;
        }

        @Override
        public Object set(Object value, int index) {
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.set(0, Integer.parseInt("E"));
            System.out.println(list);
            return null;
        }

        @Override
        public void clear() {
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");
            System.out.println("ArrayList: " + list);
            System.out.println(list.size());
            list.clear();
            System.out.println("ArrayList: " + list);
            System.out.println(list.size());
        }

        @Override
        public int size() {
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");
            System.out.println(list.size());
            return 0;
        }

        @Override
        public boolean isEmpty() {
            System.out.println("list is empty? " + list.isEmpty());
            list.add("Banana");
            System.out.println("List is empty? " + list.isEmpty());
            return false;
        }

        @Override
        public boolean contains(Object value) {
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");

            System.out.println("Does the list include banana? " + list.contains(new String("Banana")));
            System.out.println("Does the list include Pear? " + list.contains(new String("Pear")));
            return false;
        }

        @Override
        public int indexOf(Object value) {
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");

            System.out.println("Index of banana is " + list.indexOf("Banana"));
            System.out.println("Index of Pear is " + list.indexOf("Pear"));
            return 0;
        }

        @Override
        public int lastIndexOf(Object value) {
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");
            System.out.println("Index of Cherry is " + list.lastIndexOf("Cherry"));
            return 0;
        }
    }
