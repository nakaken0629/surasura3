package surasura.chapter13.list13_9;

public class Main {
    public static void main(String[] args) {
        sampleNumberAndStudend();
        sampleNameAndFriend();
    }

    static void sampleNumberAndStudend() {
        PersonMap<Integer, Student> students = new PersonMap<>();
        students.put(1, new Student("中垣健志"));
        students.put(2, new Student("林満也"));
        Student student = students.get(1);
    }

    static void sampleNameAndFriend() {
        PersonMap<String, Friend> friends = new PersonMap<>();
        friends.put("中垣健志", new Friend("学友"));
        friends.put("林満也", new Friend("職場の同僚"));
        Friend friend = friends.get("中垣健志");
    }
}
