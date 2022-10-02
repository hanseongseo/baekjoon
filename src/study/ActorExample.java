package study;

public class ActorExample {
    public static void main(String[] args) {
        String[] checkListToString = {"나이", "키", "몸무게", "경력", "성별"};

        Actor actorLee = new Actor("Lee", 24, 180, 45, 4, true);

        for (int i = 0; i < actorLee.checkList.length; i++) {
            if (actorLee.checkList[i]) {
                System.out.print(checkListToString[i] + " O ");
            } else {
                System.out.print(checkListToString[i] + " X ");
            }

        }
    }
}
