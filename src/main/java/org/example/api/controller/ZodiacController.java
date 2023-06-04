package org.example.api.controller;

import lombok.*;
//import com.google.gson.Gson;
import org.example.api.ZodiacAPI;
import org.example.models.dto.zodiac.FriendLoveMatcher;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ZodiacController implements ZodiacAPI {

    // it is better
    private HashMap<Pair, FriendLoveMatcher> zodiacMap = reConnect();


    private @NotNull HashMap<Pair, FriendLoveMatcher> reConnect(){
        HashMap<Pair, FriendLoveMatcher> map = new HashMap<>();
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Aries", 70, 70));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Taurus", 82, 89));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Gemini", 89, 86));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Cancer", 79, 88));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Leo", 91, 93));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Virgo", 84, 69));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Libra", 67, 74));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Scorpio", 89, 99));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Sagittarius", 92, 78));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Capricorn", 68, 83));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Aquarius", 97, 92));
        map.put(new Pair("oven", "Aries"), new FriendLoveMatcher("Pisces", 77, 65));

        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Aries", 70, 81));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Taurus", 93, 81));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Gemini", 70, 74));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Cancer", 86, 89));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Leo", 85, 88));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Virgo", 85, 85));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Libra", 82, 90));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Scorpio", 90, 95));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Sagittarius", 87, 93));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Capricorn", 88, 81));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Aquarius", 75, 87));
        map.put(new Pair("telec", "Taurus"), new FriendLoveMatcher("Pisces", 94, 84));

        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Aries", 72, 70));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Taurus", 80, 80));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Gemini", 82, 68));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Cancer", 68, 68));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Leo", 82, 76));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Virgo", 76, 86));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Libra", 92, 77));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Scorpio", 67, 81));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Sagittarius", 96, 93));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Capricorn", 79, 90));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Aquarius", 93, 89));
        map.put(new Pair("bliznec", "Gemini"), new FriendLoveMatcher("Pisces", 78, 68));

        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Aries", 72, 79));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Taurus", 89, 92));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Gemini", 85, 91));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Cancer", 88, 83));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Leo", 77, 79));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Virgo", 84, 76));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Libra", 74, 82));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Scorpio", 90, 68));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Sagittarius", 60, 58));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Capricorn", 80, 89));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Aquarius", 91, 97));
        map.put(new Pair("rac", "Cancer"), new FriendLoveMatcher("Pisces", 96, 95));

        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Aries", 89, 84));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Taurus", 77, 79));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Gemini", 84, 72));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Cancer", 70, 69));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Leo", 81, 67));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Virgo", 68, 77));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Libra", 91, 90));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Scorpio", 81, 83));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Sagittarius", 84, 66));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Capricorn", 64, 63));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Aquarius", 81, 79));
        map.put(new Pair("lev", "Leo"), new FriendLoveMatcher("Pisces", 80, 70));

        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Aries", 72, 75));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Taurus", 85, 83));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Gemini", 80, 87));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Cancer", 89, 87));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Leo", 80, 80));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Virgo", 82, 79));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Libra", 79, 71));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Scorpio", 74, 62));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Sagittarius", 70, 76));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Capricorn", 88, 85));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Aquarius", 79, 72));
        map.put(new Pair("deva", "Virgo"), new FriendLoveMatcher("Pisces", 75, 90));

        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Aries", 97, 92));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Taurus", 95, 96));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Gemini", 91, 89));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Cancer", 80, 94));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Leo", 96, 95));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Virgo", 81, 78));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Libra", 79, 81));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Scorpio", 84, 86));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Sagittarius", 84, 93));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Capricorn", 91, 92));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Aquarius", 91, 90));
        map.put(new Pair("vesy", "Libra"), new FriendLoveMatcher("Pisces", 81, 79));

        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Aries", 80, 91));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Taurus", 93, 82));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Gemini", 71, 79));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Cancer", 90, 95));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Leo", 95, 98));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Virgo", 85, 78));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Libra", 75, 72));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Scorpio", 79, 81));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Sagittarius", 84, 93));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Capricorn", 91, 97));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Aquarius", 88, 95));
        map.put(new Pair("scorpion", "Scorpio"), new FriendLoveMatcher("Pisces", 89, 86));

        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Aries", 79, 80));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Taurus", 83, 71));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Gemini", 70, 56));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Cancer", 68, 65));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Leo", 79, 77));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Virgo", 80, 90));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Libra", 92, 79));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Scorpio", 69, 79));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Sagittarius", 92, 90));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Capricorn", 80, 82));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Aquarius", 84, 70));
        map.put(new Pair("strelec", "Sagittarius"), new FriendLoveMatcher("Pisces", 68, 65));

        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Aries", 79, 90));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Taurus", 93, 80));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Gemini", 69, 61));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Cancer", 74, 61));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Leo", 69, 85));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Virgo", 98, 84));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Libra", 68, 65));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Scorpio", 79, 73));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Sagittarius", 76, 76));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Capricorn", 82, 68));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Aquarius", 68, 67));
        map.put(new Pair("kozerog", "Capricorn"), new FriendLoveMatcher("Pisces", 81, 86));

        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Aries", 87, 75));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Taurus", 78, 72));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Gemini", 76, 85));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Cancer", 91, 74));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Leo", 65, 76));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Virgo", 93, 83));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Libra", 72, 67));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Scorpio", 77, 76));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Sagittarius", 81, 89));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Capricorn", 90, 83));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Aquarius", 75, 64));
        map.put(new Pair("vodoley", "Aquarius"), new FriendLoveMatcher("Pisces", 70, 66));

        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Aries", 71, 79));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Taurus", 90, 92));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Gemini", 84, 95));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Cancer", 93, 94));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Leo", 83, 75));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Virgo", 74, 70));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Libra", 78, 88));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Scorpio", 92, 85));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Sagittarius", 75, 66));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Capricorn", 73, 83));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Aquarius", 92, 96));
        map.put(new Pair("ryby", "Pisces"), new FriendLoveMatcher("Pisces", 94, 94));

        return map;
    }

    @Override
    public List<FriendLoveMatcher> getConnect(String connectable) {
        zodiacMap = reConnect();
        List<FriendLoveMatcher> matcherList = new ArrayList<>();
        Set<Pair> pairSet = zodiacMap.keySet();
        for (Pair pair : pairSet) {
            if (pair.zod1 == connectable){
                matcherList.add(zodiacMap.get(pair));
            }
        }
        return zodiacMap.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
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
