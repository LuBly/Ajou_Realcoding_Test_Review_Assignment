import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

public class CustomTest {
    private List<Hero> heroes = new ArrayList<Hero>();

    @Before
    public void setUp() {

        //3개의 캐릭터 객체를 만듭니다.
        Hero Lubly = new Hero("메르세데스",2,"딜러");
        Hero Bunji = new Hero("미하일",7,"탱커");
        Hero 도적 = new Hero("듀블",10,"딜러");


        //앞서 만든 List 에 각 캐릭터를 추가합니다.
        heroes.add(Lubly);
        heroes.add(Bunji);
        heroes.add(도적);
    }

    //List<String>을 생성하고 값이 비어 있는지를 테스트 empty()
    @Test
    public void givenCollectionWhenEmptyCorrect() {
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, empty());
    }


    //객체 크기 검증 테스트 hasSize// size가 3이므로 false가 출력됨
    @Test
    public void shouldChampionCountFive() {
        assertTrue(heroes.size() == 5);
        assertThat(heroes.size(), is(5));
        assertThat(heroes, hasSize(5));
    }


    //hasProperty 활용하여 속성이 포함되어 있는지 테스트
    @Test
    public void shouldHasPropertyPosition() {
        assertThat(heroes.get(0), hasProperty("position"));
        assertThat(heroes.get(0), hasProperty("position", equalTo("딜러")));
    }

    @Test
    public void canLucid(){
        int Least_Dpm= 5;
        assertTrue((heroes.get(0).getDPM()>Least_Dpm));//각 hero가 최소 Dpm보다 높으면 가능, 낮으면 불가능
    }
    @Test
    public void positionCheck() {
        int num_Dealer = 0;
        int num_Tanker = 0;
        for (int j = 0; j < heroes.size(); ++j) {
            if (heroes.get(j).getPosition() == "딜러") num_Dealer++;
            if (heroes.get(j).getPosition() == "탱커") num_Tanker++;
        }
        assertThat(num_Dealer,is(2));
        assertThat(num_Tanker,is(3));
    }
}