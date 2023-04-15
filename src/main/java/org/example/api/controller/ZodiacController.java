package org.example.api.controller;

import lombok.*;
import org.example.api.ZodiacAPI;
import org.example.models.dto.zodiac.FriendLoveMatcher;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class ZodiacController implements ZodiacAPI {

    // it is better
    private HashMap<Pair, FriendLoveMatcher> zodiacMap = reConnect();

    @Contract(pure = true)
    private @NotNull HashMap<Pair, FriendLoveMatcher> reConnect(){
        HashMap<Pair, FriendLoveMatcher> map = new HashMap<>();

        map.put(new Pair("oven", "Овен"), new FriendLoveMatcher("Овен", 70, 70));
        map.put(new Pair("oven", "Телец"), new FriendLoveMatcher("Телец", 82, 89));
        map.put(new Pair("oven", "Близнецы"), new FriendLoveMatcher("Близнецы", 89, 86));
        map.put(new Pair("oven", "Рак"), new FriendLoveMatcher("Рак", 79, 88));
        map.put(new Pair("oven", "Лев"), new FriendLoveMatcher("Лев", 91, 93));
        map.put(new Pair("oven", "Дева"), new FriendLoveMatcher("Дева", 84, 69));
        map.put(new Pair("oven", "Весы"), new FriendLoveMatcher("Весы", 67, 74));
        map.put(new Pair("oven", "Скорпион"), new FriendLoveMatcher("Скорпион", 89, 99));
        map.put(new Pair("oven", "Стрелец"), new FriendLoveMatcher("Стрелец", 92, 78));
        map.put(new Pair("oven", "Козерог"), new FriendLoveMatcher("Козерог", 68, 83));
        map.put(new Pair("oven", "Водолей"), new FriendLoveMatcher("Водолей", 97, 92));
        map.put(new Pair("oven", "Рыбы"), new FriendLoveMatcher("Рыбы", 77, 65));

        map.put(new Pair("telec", "Овен"), new FriendLoveMatcher("Овен", 70, 81));
        map.put(new Pair("telec", "Телец"), new FriendLoveMatcher("Телец", 93, 81));
        map.put(new Pair("telec", "Близнецы"), new FriendLoveMatcher("Близнецы", 70, 74));
        map.put(new Pair("telec", "Рак"), new FriendLoveMatcher("Рак", 86, 89));
        map.put(new Pair("telec", "Лев"), new FriendLoveMatcher("Лев", 85, 88));
        map.put(new Pair("telec", "Дева"), new FriendLoveMatcher("Дева", 85, 85));
        map.put(new Pair("telec", "Весы"), new FriendLoveMatcher("Весы", 82, 90));
        map.put(new Pair("telec", "Скорпион"), new FriendLoveMatcher("Скорпион", 90, 95));
        map.put(new Pair("telec", "Стрелец"), new FriendLoveMatcher("Стрелец", 87, 93));
        map.put(new Pair("telec", "Козерог"), new FriendLoveMatcher("Козерог", 88, 81));
        map.put(new Pair("telec", "Водолей"), new FriendLoveMatcher("Водолей", 75, 87));
        map.put(new Pair("telec", "Рыбы"), new FriendLoveMatcher("Рыбы", 94, 84));

        map.put(new Pair("bliznec", "Овен"), new FriendLoveMatcher("Овен", 72, 70));
        map.put(new Pair("bliznec", "Телец"), new FriendLoveMatcher("Телец", 80, 80));
        map.put(new Pair("bliznec", "Близнецы"), new FriendLoveMatcher("Близнецы", 82, 68));
        map.put(new Pair("bliznec", "Рак"), new FriendLoveMatcher("Рак", 68, 68));
        map.put(new Pair("bliznec", "Лев"), new FriendLoveMatcher("Лев", 82, 76));
        map.put(new Pair("bliznec", "Дева"), new FriendLoveMatcher("Дева", 76, 86));
        map.put(new Pair("bliznec", "Весы"), new FriendLoveMatcher("Весы", 92, 77));
        map.put(new Pair("bliznec", "Скорпион"), new FriendLoveMatcher("Скорпион", 67, 81));
        map.put(new Pair("bliznec", "Стрелец"), new FriendLoveMatcher("Стрелец", 96, 93));
        map.put(new Pair("bliznec", "Козерог"), new FriendLoveMatcher("Козерог", 79, 90));
        map.put(new Pair("bliznec", "Водолей"), new FriendLoveMatcher("Водолей", 93, 89));
        map.put(new Pair("bliznec", "Рыбы"), new FriendLoveMatcher("Рыбы", 78, 68));

        map.put(new Pair("rac", "Овен"), new FriendLoveMatcher("Овен", 72, 79));
        map.put(new Pair("rac", "Телец"), new FriendLoveMatcher("Телец", 89, 92));
        map.put(new Pair("rac", "Близнецы"), new FriendLoveMatcher("Близнецы", 85, 91));
        map.put(new Pair("rac", "Рак"), new FriendLoveMatcher("Рак", 88, 83));
        map.put(new Pair("rac", "Лев"), new FriendLoveMatcher("Лев", 77, 79));
        map.put(new Pair("rac", "Дева"), new FriendLoveMatcher("Дева", 84, 76));
        map.put(new Pair("rac", "Весы"), new FriendLoveMatcher("Весы", 74, 82));
        map.put(new Pair("rac", "Скорпион"), new FriendLoveMatcher("Скорпион", 90, 68));
        map.put(new Pair("rac", "Стрелец"), new FriendLoveMatcher("Стрелец", 60, 58));
        map.put(new Pair("rac", "Козерог"), new FriendLoveMatcher("Козерог", 80, 89));
        map.put(new Pair("rac", "Водолей"), new FriendLoveMatcher("Водолей", 91, 97));
        map.put(new Pair("rac", "Рыбы"), new FriendLoveMatcher("Рыбы", 96, 95));

        map.put(new Pair("lev", "Овен"), new FriendLoveMatcher("Овен", 89, 84));
        map.put(new Pair("lev", "Телец"), new FriendLoveMatcher("Телец", 77, 79));
        map.put(new Pair("lev", "Близнецы"), new FriendLoveMatcher("Близнецы", 84, 72));
        map.put(new Pair("lev", "Рак"), new FriendLoveMatcher("Рак", 70, 69));
        map.put(new Pair("lev", "Лев"), new FriendLoveMatcher("Лев", 81, 67));
        map.put(new Pair("lev", "Дева"), new FriendLoveMatcher("Дева", 68, 77));
        map.put(new Pair("lev", "Весы"), new FriendLoveMatcher("Весы", 91, 90));
        map.put(new Pair("lev", "Скорпион"), new FriendLoveMatcher("Скорпион", 81, 83));
        map.put(new Pair("lev", "Стрелец"), new FriendLoveMatcher("Стрелец", 84, 66));
        map.put(new Pair("lev", "Козерог"), new FriendLoveMatcher("Козерог", 64, 63));
        map.put(new Pair("lev", "Водолей"), new FriendLoveMatcher("Водолей", 81, 79));
        map.put(new Pair("lev", "Рыбы"), new FriendLoveMatcher("Рыбы", 80, 70));

        map.put(new Pair("deva", "Овен"), new FriendLoveMatcher("Овен", 72, 75));
        map.put(new Pair("deva", "Телец"), new FriendLoveMatcher("Телец", 85, 83));
        map.put(new Pair("deva", "Близнецы"), new FriendLoveMatcher("Близнецы", 80, 87));
        map.put(new Pair("deva", "Рак"), new FriendLoveMatcher("Рак", 89, 87));
        map.put(new Pair("deva", "Лев"), new FriendLoveMatcher("Лев", 80, 80));
        map.put(new Pair("deva", "Дева"), new FriendLoveMatcher("Дева", 82, 79));
        map.put(new Pair("deva", "Весы"), new FriendLoveMatcher("Весы", 79, 71));
        map.put(new Pair("deva", "Скорпион"), new FriendLoveMatcher("Скорпион", 74, 62));
        map.put(new Pair("deva", "Стрелец"), new FriendLoveMatcher("Стрелец", 70, 76));
        map.put(new Pair("deva", "Козерог"), new FriendLoveMatcher("Козерог", 88, 85));
        map.put(new Pair("deva", "Водолей"), new FriendLoveMatcher("Водолей", 79, 72));
        map.put(new Pair("deva", "Рыбы"), new FriendLoveMatcher("Рыбы", 75, 90));

        map.put(new Pair("vesy", "Овен"), new FriendLoveMatcher("Овен", 97, 92));
        map.put(new Pair("vesy", "Телец"), new FriendLoveMatcher("Телец", 95, 96));
        map.put(new Pair("vesy", "Близнецы"), new FriendLoveMatcher("Близнецы", 91, 89));
        map.put(new Pair("vesy", "Рак"), new FriendLoveMatcher("Рак", 80, 94));
        map.put(new Pair("vesy", "Лев"), new FriendLoveMatcher("Лев", 96, 95));
        map.put(new Pair("vesy", "Дева"), new FriendLoveMatcher("Дева", 81, 78));
        map.put(new Pair("vesy", "Весы"), new FriendLoveMatcher("Весы", 79, 81));
        map.put(new Pair("vesy", "Скорпион"), new FriendLoveMatcher("Скорпион", 84, 86));
        map.put(new Pair("vesy", "Стрелец"), new FriendLoveMatcher("Стрелец", 84, 93));
        map.put(new Pair("vesy", "Козерог"), new FriendLoveMatcher("Козерог", 91, 92));
        map.put(new Pair("vesy", "Водолей"), new FriendLoveMatcher("Водолей", 91, 90));
        map.put(new Pair("vesy", "Рыбы"), new FriendLoveMatcher("Рыбы", 81, 79));

        map.put(new Pair("scorpion", "Овен"), new FriendLoveMatcher("Овен", 80, 91));
        map.put(new Pair("scorpion", "Телец"), new FriendLoveMatcher("Телец", 93, 82));
        map.put(new Pair("scorpion", "Близнецы"), new FriendLoveMatcher("Близнецы", 71, 79));
        map.put(new Pair("scorpion", "Рак"), new FriendLoveMatcher("Рак", 90, 95));
        map.put(new Pair("scorpion", "Лев"), new FriendLoveMatcher("Лев", 95, 98));
        map.put(new Pair("scorpion", "Дева"), new FriendLoveMatcher("Дева", 85, 78));
        map.put(new Pair("scorpion", "Весы"), new FriendLoveMatcher("Весы", 75, 72));
        map.put(new Pair("scorpion", "Скорпион"), new FriendLoveMatcher("Скорпион", 79, 81));
        map.put(new Pair("scorpion", "Стрелец"), new FriendLoveMatcher("Стрелец", 84, 93));
        map.put(new Pair("scorpion", "Козерог"), new FriendLoveMatcher("Козерог", 91, 97));
        map.put(new Pair("scorpion", "Водолей"), new FriendLoveMatcher("Водолей", 88, 95));
        map.put(new Pair("scorpion", "Рыбы"), new FriendLoveMatcher("Рыбы", 89, 86));

        map.put(new Pair("strelec", "Овен"), new FriendLoveMatcher("Овен", 79, 80));
        map.put(new Pair("strelec", "Телец"), new FriendLoveMatcher("Телец", 83, 71));
        map.put(new Pair("strelec", "Близнецы"), new FriendLoveMatcher("Близнецы", 70, 56));
        map.put(new Pair("strelec", "Рак"), new FriendLoveMatcher("Рак", 68, 65));
        map.put(new Pair("strelec", "Лев"), new FriendLoveMatcher("Лев", 79, 77));
        map.put(new Pair("strelec", "Дева"), new FriendLoveMatcher("Дева", 80, 90));
        map.put(new Pair("strelec", "Весы"), new FriendLoveMatcher("Весы", 92, 79));
        map.put(new Pair("strelec", "Скорпион"), new FriendLoveMatcher("Скорпион", 69, 79));
        map.put(new Pair("strelec", "Стрелец"), new FriendLoveMatcher("Стрелец", 92, 90));
        map.put(new Pair("strelec", "Козерог"), new FriendLoveMatcher("Козерог", 80, 82));
        map.put(new Pair("strelec", "Водолей"), new FriendLoveMatcher("Водолей", 84, 70));
        map.put(new Pair("strelec", "Рыбы"), new FriendLoveMatcher("Рыбы", 68, 65));

        map.put(new Pair("kozerog", "Овен"), new FriendLoveMatcher("Овен", 79, 90));
        map.put(new Pair("kozerog", "Телец"), new FriendLoveMatcher("Телец", 93, 80));
        map.put(new Pair("kozerog", "Близнецы"), new FriendLoveMatcher("Близнецы", 69, 61));
        map.put(new Pair("kozerog", "Рак"), new FriendLoveMatcher("Рак", 74, 61));
        map.put(new Pair("kozerog", "Лев"), new FriendLoveMatcher("Лев", 69, 85));
        map.put(new Pair("kozerog", "Дева"), new FriendLoveMatcher("Дева", 98, 84));
        map.put(new Pair("kozerog", "Весы"), new FriendLoveMatcher("Весы", 68, 65));
        map.put(new Pair("kozerog", "Скорпион"), new FriendLoveMatcher("Скорпион", 79, 73));
        map.put(new Pair("kozerog", "Стрелец"), new FriendLoveMatcher("Стрелец", 76, 76));
        map.put(new Pair("kozerog", "Козерог"), new FriendLoveMatcher("Козерог", 82, 68));
        map.put(new Pair("kozerog", "Водолей"), new FriendLoveMatcher("Водолей", 68, 67));
        map.put(new Pair("kozerog", "Рыбы"), new FriendLoveMatcher("Рыбы", 81, 86));

        map.put(new Pair("vodoley", "Овен"), new FriendLoveMatcher("Овен", 87, 75));
        map.put(new Pair("vodoley", "Телец"), new FriendLoveMatcher("Телец", 78, 72));
        map.put(new Pair("vodoley", "Близнецы"), new FriendLoveMatcher("Близнецы", 76, 85));
        map.put(new Pair("vodoley", "Рак"), new FriendLoveMatcher("Рак", 91, 74));
        map.put(new Pair("vodoley", "Лев"), new FriendLoveMatcher("Лев", 65, 76));
        map.put(new Pair("vodoley", "Дева"), new FriendLoveMatcher("Дева", 93, 83));
        map.put(new Pair("vodoley", "Весы"), new FriendLoveMatcher("Весы", 72, 67));
        map.put(new Pair("vodoley", "Скорпион"), new FriendLoveMatcher("Скорпион", 77, 76));
        map.put(new Pair("vodoley", "Стрелец"), new FriendLoveMatcher("Стрелец", 81, 89));
        map.put(new Pair("vodoley", "Козерог"), new FriendLoveMatcher("Козерог", 90, 83));
        map.put(new Pair("vodoley", "Водолей"), new FriendLoveMatcher("Водолей", 75, 64));
        map.put(new Pair("vodoley", "Рыбы"), new FriendLoveMatcher("Рыбы", 70, 66));

        map.put(new Pair("ryby", "Овен"), new FriendLoveMatcher("Овен", 71, 79));
        map.put(new Pair("ryby", "Телец"), new FriendLoveMatcher("Телец", 90, 92));
        map.put(new Pair("ryby", "Близнецы"), new FriendLoveMatcher("Близнецы", 84, 95));
        map.put(new Pair("ryby", "Рак"), new FriendLoveMatcher("Рак", 93, 94));
        map.put(new Pair("ryby", "Лев"), new FriendLoveMatcher("Лев", 83, 75));
        map.put(new Pair("ryby", "Дева"), new FriendLoveMatcher("Дева", 74, 70));
        map.put(new Pair("ryby", "Весы"), new FriendLoveMatcher("Весы", 78, 88));
        map.put(new Pair("ryby", "Скорпион"), new FriendLoveMatcher("Скорпион", 92, 85));
        map.put(new Pair("ryby", "Стрелец"), new FriendLoveMatcher("Стрелец", 75, 66));
        map.put(new Pair("ryby", "Козерог"), new FriendLoveMatcher("Козерог", 73, 83));
        map.put(new Pair("ryby", "Водолей"), new FriendLoveMatcher("Водолей", 92, 96));
        map.put(new Pair("ryby", "Рыбы"), new FriendLoveMatcher("Рыбы", 94, 94));

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
