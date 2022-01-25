import static java.lang.Integer.valueOf;

public class TestNode {

    public static void main(String[] args){

        String line0 = "1,2,14,-,Are you in the mood for a non-Fiction a Fiction movie?";
        String line1 = "2,3,13,-,Would you like to watch a movie about an event or a biopic?";
        String line21 = "13,15,16,-,Would you like to watch a movie about a motivational speaker or success story?";

        Node n0 = new Node();
        mapNode(n0, line0);
        Node n1 = new Node();
        mapNode(n1, line1);
        Node n21 = new Node();
        mapNode(n21, line21);

        n0.setYesNode(n1);
        n0.setNoNode(n21);

        System.out.println(n0.toString());
        System.out.println(n0.getYesNode().toString());
        System.out.println(n0.getNoNode().toString());

    }

    public static void mapNode(Node n, String line)
    {
        String[] stringArray = line.split(",");
        n.setID(valueOf(stringArray[0]));
        n.setYesID(valueOf(stringArray[1]));
        n.setNoID(valueOf(stringArray[2]));
        n.setDescription(stringArray[3]);
        n.setQuestion(stringArray[4]);
    }





}


