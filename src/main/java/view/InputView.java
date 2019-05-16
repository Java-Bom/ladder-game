package view;

import dto.GameStartOption;

import java.io.InputStream;
import java.util.Scanner;

public class InputView {
    public static Scanner sc;

    private InputView(InputStream inputStream) {
        sc = new Scanner(inputStream);
    }

    public static InputView of(InputStream inputStream){
        return new InputView(inputStream);
    }

    public String participants() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return sc.next();
    }

    public int ladderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return sc.nextInt();
    }

    public GameStartOption initGameStartOption(){
        String participants = participants();
        int ladderHeight = ladderHeight();

        return new GameStartOption(participants, ladderHeight);
    }

}
