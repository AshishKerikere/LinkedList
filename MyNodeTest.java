public class MyNodeTest {
    public static void main(String[] args) {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecongNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecongNode);
        mySecongNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecongNode) &&
                         mySecongNode.getNext().equals(myThirdNode);

        System.out.println(result);

    }
}
