package org.example.api.controller;

import lombok.*;
import org.example.api.ZodiacAPI;
import org.example.models.dto.zodiac.FriendLoveMatcher;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ZodiacController implements ZodiacAPI {

    // it is better
    private HashMap<Pair, FriendLoveMatcher> zodiacMap = reConnect();


    private @NotNull HashMap<Pair, FriendLoveMatcher> reConnect(){
        HashMap<Pair, FriendLoveMatcher> map = new HashMap<>();
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Aries", 70, 70));
        map.put(new Pair("oven", "Taurus"), new FriendLoveMatcher("Taurus", 82, 89));
        map.put(new Pair("oven", "Gemini"), new FriendLoveMatcher("Gemini", 89, 86));
        map.put(new Pair("oven", "Cancer"), new FriendLoveMatcher("Cancer", 79, 88));
        map.put(new Pair("oven", "Leo"), new FriendLoveMatcher("Leo", 91, 93));
        map.put(new Pair("oven", "Virgo"), new FriendLoveMatcher("Virgo", 84, 69));
        map.put(new Pair("oven", "Libra"), new FriendLoveMatcher("Libra", 67, 74));
        map.put(new Pair("oven", "Scorpio"), new FriendLoveMatcher("Scorpio", 89, 99));
        map.put(new Pair("oven", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 92, 78));
        map.put(new Pair("oven", "Capricorn"), new FriendLoveMatcher("Capricorn", 68, 83));
        map.put(new Pair("oven", "Aquarius"), new FriendLoveMatcher("Aquarius", 97, 92));
        map.put(new Pair("oven", "Pisces"), new FriendLoveMatcher("Pisces", 77, 65));

        map.put(new Pair("telec", "Aries"), new FriendLoveMatcher("Aries", 70, 81));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Taurus", 93, 81));
        map.put(new Pair("telec", "Gemini"), new FriendLoveMatcher("Gemini", 70, 74));
        map.put(new Pair("telec", "Cancer"), new FriendLoveMatcher("Cancer", 86, 89));
        map.put(new Pair("telec", "Leo"), new FriendLoveMatcher("Leo", 85, 88));
        map.put(new Pair("telec", "Virgo"), new FriendLoveMatcher("Virgo", 85, 85));
        map.put(new Pair("telec", "Libra"), new FriendLoveMatcher("Libra", 82, 90));
        map.put(new Pair("telec", "Scorpio"), new FriendLoveMatcher("Scorpio", 90, 95));
        map.put(new Pair("telec", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 87, 93));
        map.put(new Pair("telec", "Capricorn"), new FriendLoveMatcher("Capricorn", 88, 81));
        map.put(new Pair("telec", "Aquarius"), new FriendLoveMatcher("Aquarius", 75, 87));
        map.put(new Pair("telec", "Pisces"), new FriendLoveMatcher("Pisces", 94, 84));

        map.put(new Pair("bliznec", "Aries"), new FriendLoveMatcher("Aries", 72, 70));
        map.put(new Pair("bliznec", "Taurus"), new FriendLoveMatcher("Taurus", 80, 80));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Gemini", 82, 68));
        map.put(new Pair("bliznec", "Cancer"), new FriendLoveMatcher("Cancer", 68, 68));
        map.put(new Pair("bliznec", "Leo"), new FriendLoveMatcher("Leo", 82, 76));
        map.put(new Pair("bliznec", "Virgo"), new FriendLoveMatcher("Virgo", 76, 86));
        map.put(new Pair("bliznec", "Libra"), new FriendLoveMatcher("Libra", 92, 77));
        map.put(new Pair("bliznec", "Scorpio"), new FriendLoveMatcher("Scorpio", 67, 81));
        map.put(new Pair("bliznec", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 96, 93));
        map.put(new Pair("bliznec", "Capricorn"), new FriendLoveMatcher("Capricorn", 79, 90));
        map.put(new Pair("bliznec", "Aquarius"), new FriendLoveMatcher("Aquarius", 93, 89));
        map.put(new Pair("bliznec", "Pisces"), new FriendLoveMatcher("Pisces", 78, 68));

        map.put(new Pair("rac", "Aries"), new FriendLoveMatcher("Aries", 72, 79));
        map.put(new Pair("rac", "Taurus"), new FriendLoveMatcher("Taurus", 89, 92));
        map.put(new Pair("rac", "Gemini"), new FriendLoveMatcher("Gemini", 85, 91));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Cancer", 88, 83));
        map.put(new Pair("rac", "Leo"), new FriendLoveMatcher("Leo", 77, 79));
        map.put(new Pair("rac", "Virgo"), new FriendLoveMatcher("Virgo", 84, 76));
        map.put(new Pair("rac", "Libra"), new FriendLoveMatcher("Libra", 74, 82));
        map.put(new Pair("rac", "Scorpio"), new FriendLoveMatcher("Scorpio", 90, 68));
        map.put(new Pair("rac", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 60, 58));
        map.put(new Pair("rac", "Capricorn"), new FriendLoveMatcher("Capricorn", 80, 89));
        map.put(new Pair("rac", "Aquarius"), new FriendLoveMatcher("Aquarius", 91, 97));
        map.put(new Pair("rac", "Pisces"), new FriendLoveMatcher("Pisces", 96, 95));

        map.put(new Pair("lev", "Aries"), new FriendLoveMatcher("Aries", 89, 84));
        map.put(new Pair("lev", "Taurus"), new FriendLoveMatcher("Taurus", 77, 79));
        map.put(new Pair("lev", "Gemini"), new FriendLoveMatcher("Gemini", 84, 72));
        map.put(new Pair("lev", "Cancer"), new FriendLoveMatcher("Cancer", 70, 69));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Leo", 81, 67));
        map.put(new Pair("lev", "Virgo"), new FriendLoveMatcher("Virgo", 68, 77));
        map.put(new Pair("lev", "Libra"), new FriendLoveMatcher("Libra", 91, 90));
        map.put(new Pair("lev", "Scorpio"), new FriendLoveMatcher("Scorpio", 81, 83));
        map.put(new Pair("lev", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 84, 66));
        map.put(new Pair("lev", "Capricorn"), new FriendLoveMatcher("Capricorn", 64, 63));
        map.put(new Pair("lev", "Aquarius"), new FriendLoveMatcher("Aquarius", 81, 79));
        map.put(new Pair("lev", "Pisces"), new FriendLoveMatcher("Pisces", 80, 70));

        map.put(new Pair("deva", "Aries"), new FriendLoveMatcher("Aries", 72, 75));
        map.put(new Pair("deva", "Taurus"), new FriendLoveMatcher("Taurus", 85, 83));
        map.put(new Pair("deva", "Gemini"), new FriendLoveMatcher("Gemini", 80, 87));
        map.put(new Pair("deva", "Cancer"), new FriendLoveMatcher("Cancer", 89, 87));
        map.put(new Pair("deva", "Leo"), new FriendLoveMatcher("Leo", 80, 80));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Virgo", 82, 79));
        map.put(new Pair("deva", "Libra"), new FriendLoveMatcher("Libra", 79, 71));
        map.put(new Pair("deva", "Scorpio"), new FriendLoveMatcher("Scorpio", 74, 62));
        map.put(new Pair("deva", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 70, 76));
        map.put(new Pair("deva", "Capricorn"), new FriendLoveMatcher("Capricorn", 88, 85));
        map.put(new Pair("deva", "Aquarius"), new FriendLoveMatcher("Aquarius", 79, 72));
        map.put(new Pair("deva", "Pisces"), new FriendLoveMatcher("Pisces", 75, 90));

        map.put(new Pair("vesy", "Aries"), new FriendLoveMatcher("Aries", 97, 92));
        map.put(new Pair("vesy", "Taurus"), new FriendLoveMatcher("Taurus", 95, 96));
        map.put(new Pair("vesy", "Gemini"), new FriendLoveMatcher("Gemini", 91, 89));
        map.put(new Pair("vesy", "Cancer"), new FriendLoveMatcher("Cancer", 80, 94));
        map.put(new Pair("vesy", "Leo"), new FriendLoveMatcher("Leo", 96, 95));
        map.put(new Pair("vesy", "Virgo"), new FriendLoveMatcher("Virgo", 81, 78));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Libra", 79, 81));
        map.put(new Pair("vesy", "Scorpio"), new FriendLoveMatcher("Scorpio", 84, 86));
        map.put(new Pair("vesy", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 84, 93));
        map.put(new Pair("vesy", "Capricorn"), new FriendLoveMatcher("Capricorn", 91, 92));
        map.put(new Pair("vesy", "Aquarius"), new FriendLoveMatcher("Aquarius", 91, 90));
        map.put(new Pair("vesy", "Pisces"), new FriendLoveMatcher("Pisces", 81, 79));

        map.put(new Pair("scorpion", "Aries"), new FriendLoveMatcher("Aries", 80, 91));
        map.put(new Pair("scorpion", "Taurus"), new FriendLoveMatcher("Taurus", 93, 82));
        map.put(new Pair("scorpion", "Gemini"), new FriendLoveMatcher("Gemini", 71, 79));
        map.put(new Pair("scorpion", "Cancer"), new FriendLoveMatcher("Cancer", 90, 95));
        map.put(new Pair("scorpion", "Leo"), new FriendLoveMatcher("Leo", 95, 98));
        map.put(new Pair("scorpion", "Virgo"), new FriendLoveMatcher("Virgo", 85, 78));
        map.put(new Pair("scorpion", "Libra"), new FriendLoveMatcher("Libra", 75, 72));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Scorpio", 79, 81));
        map.put(new Pair("scorpion", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 84, 93));
        map.put(new Pair("scorpion", "Capricorn"), new FriendLoveMatcher("Capricorn", 91, 97));
        map.put(new Pair("scorpion", "Aquarius"), new FriendLoveMatcher("Aquarius", 88, 95));
        map.put(new Pair("scorpion", "Pisces"), new FriendLoveMatcher("Pisces", 89, 86));

        map.put(new Pair("strelec", "Aries"), new FriendLoveMatcher("Aries", 79, 80));
        map.put(new Pair("strelec", "Taurus"), new FriendLoveMatcher("Taurus", 83, 71));
        map.put(new Pair("strelec", "Gemini"), new FriendLoveMatcher("Gemini", 70, 56));
        map.put(new Pair("strelec", "Cancer"), new FriendLoveMatcher("Cancer", 68, 65));
        map.put(new Pair("strelec", "Leo"), new FriendLoveMatcher("Leo", 79, 77));
        map.put(new Pair("strelec", "Virgo"), new FriendLoveMatcher("Virgo", 80, 90));
        map.put(new Pair("strelec", "Libra"), new FriendLoveMatcher("Libra", 92, 79));
        map.put(new Pair("strelec", "Scorpio"), new FriendLoveMatcher("Scorpio", 69, 79));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 92, 90));
        map.put(new Pair("strelec", "Capricorn"), new FriendLoveMatcher("Capricorn", 80, 82));
        map.put(new Pair("strelec", "Aquarius"), new FriendLoveMatcher("Aquarius", 84, 70));
        map.put(new Pair("strelec", "Pisces"), new FriendLoveMatcher("Pisces", 68, 65));

        map.put(new Pair("kozerog", "Aries"), new FriendLoveMatcher("Aries", 79, 90));
        map.put(new Pair("kozerog", "Taurus"), new FriendLoveMatcher("Taurus", 93, 80));
        map.put(new Pair("kozerog", "Gemini"), new FriendLoveMatcher("Gemini", 69, 61));
        map.put(new Pair("kozerog", "Cancer"), new FriendLoveMatcher("Cancer", 74, 61));
        map.put(new Pair("kozerog", "Leo"), new FriendLoveMatcher("Leo", 69, 85));
        map.put(new Pair("kozerog", "Virgo"), new FriendLoveMatcher("Virgo", 98, 84));
        map.put(new Pair("kozerog", "Libra"), new FriendLoveMatcher("Libra", 68, 65));
        map.put(new Pair("kozerog", "Scorpio"), new FriendLoveMatcher("Scorpio", 79, 73));
        map.put(new Pair("kozerog", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 76, 76));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Capricorn", 82, 68));
        map.put(new Pair("kozerog", "Aquarius"), new FriendLoveMatcher("Aquarius", 68, 67));
        map.put(new Pair("kozerog", "Pisces"), new FriendLoveMatcher("Pisces", 81, 86));

        map.put(new Pair("vodoley", "Aries"), new FriendLoveMatcher("Aries", 87, 75));
        map.put(new Pair("vodoley", "Taurus"), new FriendLoveMatcher("Taurus", 78, 72));
        map.put(new Pair("vodoley", "Gemini"), new FriendLoveMatcher("Gemini", 76, 85));
        map.put(new Pair("vodoley", "Cancer"), new FriendLoveMatcher("Cancer", 91, 74));
        map.put(new Pair("vodoley", "Leo"), new FriendLoveMatcher("Leo", 65, 76));
        map.put(new Pair("vodoley", "Virgo"), new FriendLoveMatcher("Virgo", 93, 83));
        map.put(new Pair("vodoley", "Libra"), new FriendLoveMatcher("Libra", 72, 67));
        map.put(new Pair("vodoley", "Scorpio"), new FriendLoveMatcher("Scorpio", 77, 76));
        map.put(new Pair("vodoley", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 81, 89));
        map.put(new Pair("vodoley", "Capricorn"), new FriendLoveMatcher("Capricorn", 90, 83));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Aquarius", 75, 64));
        map.put(new Pair("vodoley", "Pisces"), new FriendLoveMatcher("Pisces", 70, 66));

        map.put(new Pair("ryby", "Aries"), new FriendLoveMatcher("Aries", 71, 79));
        map.put(new Pair("ryby", "Taurus"), new FriendLoveMatcher("Taurus", 90, 92));
        map.put(new Pair("ryby", "Gemini"), new FriendLoveMatcher("Gemini", 84, 95));
        map.put(new Pair("ryby", "Cancer"), new FriendLoveMatcher("Cancer", 93, 94));
        map.put(new Pair("ryby", "Leo"), new FriendLoveMatcher("Leo", 83, 75));
        map.put(new Pair("ryby", "Virgo"), new FriendLoveMatcher("Virgo", 74, 70));
        map.put(new Pair("ryby", "Libra"), new FriendLoveMatcher("Libra", 78, 88));
        map.put(new Pair("ryby", "Scorpio"), new FriendLoveMatcher("Scorpio", 92, 85));
        map.put(new Pair("ryby", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 75, 66));
        map.put(new Pair("ryby", "Capricorn"), new FriendLoveMatcher("Capricorn", 73, 83));
        map.put(new Pair("ryby", "Aquarius"), new FriendLoveMatcher("Aquarius", 92, 96));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Pisces", 94, 94));

        return map;
    }

    @Override
    public List<FriendLoveMatcher> getConnect(String connectable) {
        zodiacMap = reConnect();
        List<FriendLoveMatcher> matcherList = new ArrayList<>();
        Set<Pair> pairSet = zodiacMap.keySet();
        for (Pair pair : pairSet) {
            if (Objects.equals(pair.zod1, connectable)){
                matcherList.add(zodiacMap.get(pair));
            }
        }
        return matcherList;
//        return zodiacMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }


    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    private static class Pair{
        private String zod1;
        private String zod2;

        @Override
        public String toString() {
            return zod1 + "_" + zod2;
        }
    }
}
