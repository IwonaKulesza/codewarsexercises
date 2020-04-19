import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.stream.*;
import java.util.Arrays;

// TODO: Replace examples and use TDD development by writing your own tests

public class TopWordsTest {

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("zkxz", "xtw", "drqmmicuj"),                 TopWords.top3("v'nfzul cvdlay_v'nfzul mno dgnxdhilig?xoyngyors/xtw!dgnxdhilig mno-cvdlay.eswujhvezu drqmmicuj emlhpfmq;ivkhsv ejdzmldfe?drqmmicuj zkxz xehiiaq zkxz eerhoaszcr sai_xtw drqmmicuj eerhoaszcr emlhpfmq:sai xtw xtw-drqmmicuj,cvdlay xehiiaq dgnxdhilig dgnxdhilig emlhpfmq xehiiaq xtw v'nfzul:ivkhsv xtw/ivkhsv?zkxz,dgnxdhilig zkxz_drqmmicuj:xehiiaq eswujhvezu lwfxhyjg-zkxz.lwfxhyjg_xnnstcz xtw/drqmmicuj-drqmmicuj ivkhsv:lwfxhyjg sai.cvpfnhgou zkxz?xtw/eerhoaszcr_eerhoaszcr eerhoaszcr;xoyngyors lwfxhyjg.xehiiaq/zkxz emlhpfmq zkxz eerhoaszcr ejdzmldfe!xehiiaq lwfxhyjg;xehiiaq dgnxdhilig xtw:ivkhsv sai.drqmmicuj/sai zkxz zkxz-dgnxdhilig/mno cvpfnhgou emlhpfmq v'nfzul;cvdlay.ivkhsv xehiiaq emlhpfmq/cvpfnhgou ejdzmldfe fdpiisnta cvdlay/drqmmicuj,xehiiaq xehiiaq fdpiisnta;xoyngyors xoyngyors ivkhsv emlhpfmq sai:drqmmicuj drqmmicuj zkxz v'nfzul;cvdlay!drqmmicuj ejdzmldfe cvdlay xehiiaq lwfxhyjg fdpiisnta eerhoaszcr xehiiaq!zkxz cvdlay sai/zkxz!zkxz xehiiaq mno drqmmicuj fdpiisnta sai ivkhsv fdpiisnta xoyngyors xtw sai cvdlay/cvdlay drqmmicuj.sai ejdzmldfe:xtw:ejdzmldfe cvdlay!lwfxhyjg mno-ejdzmldfe ejdzmldfe zkxz.zkxz,xoyngyors zkxz emlhpfmq ejdzmldfe dgnxdhilig:lwfxhyjg,eswujhvezu cvdlay:ejdzmldfe?mno fdpiisnta ivkhsv mno cvdlay/zkxz-xehiiaq/xehiiaq sai zkxz cvpfnhgou xehiiaq eerhoaszcr eswujhvezu xtw xtw;sai-mno/xtw;v'nfzul cvdlay xehiiaq ejdzmldfe drqmmicuj?xehiiaq-sai!lwfxhyjg;drqmmicuj:drqmmicuj fdpiisnta/eerhoaszcr xtw:mno ejdzmldfe;emlhpfmq ejdzmldfe,ivkhsv sai_v'nfzul!emlhpfmq;xehiiaq:ejdzmldfe;drqmmicuj v'nfzul!ivkhsv!zkxz/ejdzmldfe xehiiaq sai!lwfxhyjg/xtw emlhpfmq drqmmicuj eerhoaszcr.xoyngyors,zkxz dgnxdhilig_mno eerhoaszcr xoyngyors xehiiaq xtw,cvpfnhgou.mno:drqmmicuj dgnxdhilig mno-cvdlay mno_fdpiisnta,mno,emlhpfmq xtw mno mno cvdlay;eerhoaszcr/mno dgnxdhilig v'nfzul,xtw_xtw.sai xehiiaq:zkxz/cvdlay xehiiaq ejdzmldfe?zkxz fdpiisnta xtw zkxz_mno cvpfnhgou xtw eerhoaszcr,eerhoaszcr eerhoaszcr ivkhsv xtw-ivkhsv_eswujhvezu dgnxdhilig xoyngyors eswujhvezu xehiiaq!zkxz sai zkxz-emlhpfmq/drqmmicuj/eswujhvezu zkxz?ivkhsv v'nfzul emlhpfmq?ejdzmldfe,emlhpfmq.sai:v'nfzul mno lwfxhyjg:mno xtw,eerhoaszcr!drqmmicuj_zkxz:mno fdpiisnta xoyngyors;drqmmicuj_xtw/drqmmicuj xtw ivkhsv drqmmicuj,v'nfzul_fdpiisnta ivkhsv,sai drqmmicuj/sai_emlhpfmq emlhpfmq sai drqmmicuj ejdzmldfe mno xehiiaq lwfxhyjg xtw-sai eswujhvezu xehiiaq ejdzmldfe drqmmicuj mno.xehiiaq_eerhoaszcr!xoyngyors zkxz lwfxhyjg eswujhvezu_eswujhvezu;ivkhsv-sai eerhoaszcr!emlhpfmq,xoyngyors!eswujhvezu sai!xehiiaq sai zkxz!emlhpfmq xtw sai xtw "));
        assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }
}