package dev.felnull.dokata;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.zip.GZIPInputStream;

/**
 * 変態糞土方/変態糞親父の怪文取得
 *
 * <img alt="DokataImage" src="https://cdn.discordapp.com/attachments/358878159615164416/892345928055398420/r1280x720l.jpg">
 *
 * @author MORIMORI0317
 * @see <a href="https://dic.nicovideo.jp/a/%E5%A4%89%E6%85%8B%E7%B3%9E%E8%A6%AA%E7%88%B6">label</a>
 * @since 1.0
 */
public class KusoDokata {
    private static final Map<String, String> DOKATA = new HashMap<>();

    private static String getDokata(String string) {
        InputStream stream = KusoDokata.class.getResourceAsStream("/dokata/" + string);

        if (stream != null) {
            try {
                stream = new GZIPInputStream(stream);
                DOKATA.put(string, new String(Base64.getDecoder().decode(new String(streamToByteArray(stream), StandardCharsets.UTF_8)), StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return DOKATA.get(string);
    }

    /**
     * 糞まみれで　投稿者：変態糞親父 (8月10日（木）14時30分56秒)
     *
     * @return 全文
     */
    public static String getKusomamirede() {
        return getDokata("kusomamire");
    }

    /**
     * やったぜ。　投稿者：変態糞土方 (8月16日（水）07時14分22秒)
     *
     * @return 全文
     */
    public static String getYattaze() {
        return getDokata("yattaze");
    }

    /**
     * やりたい　投稿者：糞親父 (7月11日（火）22時41分11秒)
     *
     * @return 全文
     */
    public static String getYaritai() {
        return getDokata("yaritai");
    }

    /**
     * せんずり　投稿者：変態親父 (3月8日（木）00時21分39秒)
     *
     * @return 全文
     */
    public static String getSenzuri() {
        return getDokata("senzuri");
    }

    /**
     * 糞・糞・糞　投稿者：変態糞親父 (6月10日（土）11時27分36秒)
     *
     * @return 全文
     */
    public static String getKusoKusoKuso() {
        return getDokata("kusokusokuso");
    }

    /**
     * 糞まみれ　投稿者：変態土方 (5月25日（水）21時52分21秒)
     *
     * @return 全文
     */
    public static String getKusomamire() {
        return getDokata("kusomamirede");
    }

    /**
     * 糞ずき親父・爺様募集　投稿者：変態糞親父 投稿日： 6月13日(月)21時12分15秒
     *
     * @return 全文
     */
    public static String getKusozukiOyajiJisamaBoshu() {
        return getDokata("kusozukioyajijisamaboshu");
    }

    /**
     * 糞まみれで　投稿者：変態糞親父 (3月20日（火）22時50分14秒)
     *
     * @return 全文
     */
    public static String getKusomamirede2() {
        return getDokata("kusomamirede2");
    }

    /**
     * はやくやりまくりたいよ 投稿者：変態糞親父 投稿日：2005年 7月14日(木)20時21分12秒
     *
     * @return 全文
     */
    public static String getHayakuYariMakuriTaiyo() {
        return getDokata("hayakuyarimakuritaiyo");
    }

    /**
     * 早く糞まみれに 投稿者：変態糞親父 投稿日：2005年 7月31日(日)09時50分8秒
     *
     * @return 全文
     */
    public static String getHayakuKusoMamireni() {
        return getDokata("hayakukusomamireni");
    }

    /**
     * 糞まみれ
     *
     * @return 全文
     */
    public static String getKusomamire2() {
        return getDokata("kusomamire2");
    }

    /**
     * 糞まみれ　投稿者：変態糞親父 投稿日：2005年 6月23日(木)23時46分33秒
     *
     * @return 全文
     */
    public static String getKusomamire3() {
        return getDokata("kusomamire3");
    }

    /**
     * 禁断症状が　投稿者：変態糞親父 投稿日： 8月21日(日)22時35分27秒
     *
     * @return 全文
     */
    public static String getKindanSyouJoga() {
        return getDokata("kindansyoujoga");
    }

    /**
     * 糞親父 投稿者：変態糞親父 投稿日：2005年 9月14日(水)22時14分2秒
     *
     * @return 全文
     */
    public static String getKusoOyaji() {
        return getDokata("kusooyaji");
    }

    /**
     * やろうぜ　投稿者：土方 (10月10日（月）09時57分43秒)
     *
     * @return 全文
     */
    public static String getYarouze() {
        return getDokata("yarouze");
    }

    /**
     * 野外で 投稿者：変態糞親父 投稿日：2005年10月 3日(月)23時41分53秒
     *
     * @return 全文
     */
    public static String getYagaiDe() {
        return getDokata("yagaide");
    }

    /**
     * 糞まみれ　投稿者：変態糞親父 (5月7日（日）14時40分06秒)
     *
     * @return 全文
     */
    public static String getKusomamire4() {
        return getDokata("kusomamire4");
    }

    /**
     * やりてえ～　投稿者：変態糞親父 (5月16日（火）21時15分50秒)
     *
     * @return 全文
     */
    public static String getYaritexe() {
        return getDokata("yaritexe");
    }

    /**
     * 糞まみれで　投稿者：変態糞親父 (5月16日（火）21時33分11秒)
     *
     * @return 全文
     */
    public static String getKusomamirede3() {
        return getDokata("kusomamirede3");
    }

    /**
     * 糞まみれ　投稿者：糞・くそ・kuso (8月3日（日）08時58分07秒)
     *
     * @return 全文
     */
    public static String getKusomamire5() {
        return getDokata("kusomamire5");
    }

    /**
     * くそ　投稿者：変態糞親父 (8月10日（日）05時09分05秒)
     *
     * @return 全文
     */
    public static String getKuso() {
        return getDokata("kuso");
    }

    /**
     * 糞大好き　投稿者：糞おやじ (12月30日（火）22時35分13秒)
     *
     * @return 全文
     */
    public static String getKusoDaisuki() {
        return getDokata("kusodaisuki");
    }

    /**
     * 山の中で　2002/5/11 16時
     *
     * @return 全文
     */
    public static String getYamaNoNakaDe() {
        return getDokata("yamanonakade");
    }

    /**
     * 山の中で　２　2002/5/11 16時
     *
     * @return 全文
     */
    public static String getYamaNoNakaDe2() {
        return getDokata("yamanonakade2");
    }

    /**
     * 山の中で　３　2002/5/11 17時
     *
     * @return 全文
     */
    public static String getYamaNoNakaDe3() {
        return getDokata("yamanonakade3");
    }

    /**
     * 縛って 変態おやじ 登録日：1月9日（日）10時18分14秒
     *
     * @return 全文
     */
    public static String getSibatte() {
        return getDokata("sibatte");
    }

    /**
     * 本気で　投稿者：変態親父(1月18日（火）12時32分00秒)
     *
     * @return 全文
     */
    public static String getHonkide() {
        return getDokata("honkide");
    }

    /**
     * 変態大好き　61歳 岡山
     *
     * @return 全文
     */
    public static String getHentaiDaisuki() {
        return getDokata("hentaidaisuki");
    }

    /**
     * 浮浪者のおっさん　投稿者：褌親父 (2月7日（水）22時41分04秒)
     *
     * @return 全文
     */
    public static String getFuroShaNoOssan() {
        return getDokata("furoshanoossan");
    }

    /**
     * 野外で　投稿者：褌親父 (5月5日（金）21時28分21秒)
     *
     * @return 全文
     */
    public static String getYagaiDe2() {
        return getDokata("yagaide2");
    }

    /**
     * 真っ黒　投稿者：墨入れちんぽ (8月3日（日）07時44分19秒)
     *
     * @return 全文
     */
    public static String getMakkuro() {
        return getDokata("makkuro");
    }

    /**
     * やりまくり　投稿者：墨入れちんぽ (6月29日（日）09時23分36秒)
     *
     * @return 全文
     */
    public static String getYarimakuri() {
        return getDokata("yarimakuri");
    }

    /**
     * 串刺し　投稿者：墨入れちんぽ (7月26日（土）20時31分38秒)
     *
     * @return 全文
     */
    public static String getKushizashi() {
        return getDokata("kushizashi");
    }

    /**
     * 露出したぜ。　投稿者：変態おやじ (1月3日（土）10時50分29秒)
     *
     * @return 全文
     */
    public static String getRoshutsuShitaZe() {
        return getDokata("roshutsushitaze");
    }

    /**
     * やろうぜ　投稿者：変態おやじ (1月3日（土）10時57分07秒)
     *
     * @return 全文
     */
    public static String getYarouze2() {
        return getDokata("yarouze2");
    }

    /**
     * 一緒に おっさん 登録日：1月3日（土）14時55分37秒
     *
     * @return 全文
     */
    public static String getIssyoni() {
        return getDokata("issyoni");
    }

    /**
     * 岡山で　投稿者：へんたいおやじ (8月10日（日）05時20分23秒)
     *
     * @return 全文
     */
    public static String getOkayamade() {
        return getDokata("okayamade");
    }

    /**
     * 倉敷向山露出好き　投稿者：変態おやじ (12月30日（火）22時42分39秒)
     *
     * @return 全文
     */
    public static String getKurashikiMukaiyamaRoshutsuZuki() {
        return getDokata("kurashikimukaiyamaroshutsuzuki");
    }

    public static enum Dokata {
        KUSOMAMIRE(KusoDokata::getKusomamire),
        YATTAZE(KusoDokata::getYattaze),
        YARITAI(KusoDokata::getYaritai),
        SENZURI(KusoDokata::getSenzuri),
        KUSOKUSOKUSO(KusoDokata::getKusoKusoKuso),
        KUSOMAMIREDE(KusoDokata::getKusomamirede),
        KUSOZUKIOYAJIJISAMABOSHU(KusoDokata::getKusozukiOyajiJisamaBoshu),
        KUSOMAMIREDE2(KusoDokata::getKusomamirede2),
        HAYAKUYARIMAKURITAIYO(KusoDokata::getHayakuYariMakuriTaiyo),
        HAYAKUKUSOMAMIRENI(KusoDokata::getHayakuKusoMamireni),
        KUSOMAMIRE2(KusoDokata::getKusomamire2),
        KUSOMAMIRE3(KusoDokata::getKusomamire3),
        KINDANSYOUJOGA(KusoDokata::getKindanSyouJoga),
        KUSOOYAJI(KusoDokata::getKusoOyaji),
        YAROUZE(KusoDokata::getYarouze),
        YAGAIDE(KusoDokata::getYagaiDe),
        KUSOMAMIRE4(KusoDokata::getKusomamire4),
        YARITEXE(KusoDokata::getYaritexe),
        KUSOMAMIREDE3(KusoDokata::getKusomamirede3),
        KUSOMAMIRE5(KusoDokata::getKusomamire5),
        KUSO(KusoDokata::getKuso),
        KUSODAISUKI(KusoDokata::getKusoDaisuki),
        YAMANONAKADE(KusoDokata::getYamaNoNakaDe),
        YAMANONAKADE2(KusoDokata::getYamaNoNakaDe2),
        YAMANONAKADE3(KusoDokata::getYamaNoNakaDe3),
        SIBATTE(KusoDokata::getSibatte),
        HONKIDE(KusoDokata::getHonkide),
        HENTAIDAISUKI(KusoDokata::getHentaiDaisuki),
        FUROSHANOOSSAN(KusoDokata::getFuroShaNoOssan),
        YAGAIDE2(KusoDokata::getYagaiDe2),
        MAKKURO(KusoDokata::getMakkuro),
        YARIMAKURI(KusoDokata::getYarimakuri),
        KUSHIZASHI(KusoDokata::getKushizashi),
        ROSHUTSUSHITAZE(KusoDokata::getRoshutsuShitaZe),
        YAROUZE2(KusoDokata::getYarouze2),
        ISSYONI(KusoDokata::getIssyoni),
        OKAYAMADE(KusoDokata::getOkayamade),
        KURASHIKIMUKAIYAMAROSHUTSUZUKI(KusoDokata::getKurashikiMukaiyamaRoshutsuZuki);
        private final Supplier<String> str;

        Dokata(Supplier<String> st) {
            this.str = st;
        }

        public String getString() {
            return str.get();
        }
    }

    private static byte[] streamToByteArray(InputStream stream) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (true) {
            int len = stream.read(buffer);
            if (len < 0) {
                break;
            }
            bout.write(buffer, 0, len);
        }
        return bout.toByteArray();
    }

}
