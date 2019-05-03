package domain.ladder;

import data.InputData;
import domain.ladder.Ladder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LadderTest {

    @Test
    public void Ladder_생성하기_Pillar_리스트_생성하기() {
        InputData inputData = new InputData("pobi,honux,crong,jk", 4);
        Ladder ladder = new Ladder(inputData);

        assertEquals((int) ladder.getWidth(), ladder.getPillars().size());
    }


//        @Test
//    public void 이전기둥불러오기_left_pillar() {
//        InputData inputData = new InputData(3,4);
//        Ladder ladder = new Ladder(inputData);
//        Pillar now = ladder.getPillars().get(2);
//            System.out.println(now.getPillarNum());
//        assertEquals(0, ladder.getPreviousPillar(now));
//        assertEquals(2, ladder.getNextPillar(now));
//    }

//    @Test
//    public void 이전기둥이_유효하지_않을때_체크하기() {
//        Pillar pillar = new Pillar(1);
////        Pillar previous = pillar.getPreviousPillar();
//        assertEquals(null, previous);
//
//    }

}