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

            return null;
        }

        @Override
        public void clear() {

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object value) {
            return false;
        }

        @Override
        public int indexOf(Object value) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object value) {
            return 0;
        }
    }
