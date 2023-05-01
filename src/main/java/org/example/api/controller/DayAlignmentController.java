package org.example.api.controller;

import org.example.api.DayAlignmentAPI;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class DayAlignmentController implements DayAlignmentAPI {

    @Contract(pure = true)
    private @NotNull Set<String> reConnectYesNo(){
        Set<String> set = new HashSet<>();
        set.add("Ответ «нет». Пока это невозможно. Существуют внешние обстоятельства, на которые вы не можете повлиять. Сейчас вам остается только ждать более благоприятного момента.");
        set.add("Ответ «да», но только если вопрос касается лично вас. Относительно третьих лиц на данный вопрос ответа быть не может. Не стоит вмешиваться в поле других людей.");
        set.add("Ответ «нет». Вы слишком полагаетесь на судьбу и вкладываете недостаточно времени и сил.");
        set.add("Ответ «да», но при условии, что вы поможете человеку, который сейчас в беде. Помощь необязательно должна быть материальной. Оглянитесь вокруг, кому-то из близких очень необходима ваша поддержка.");
        set.add("Ответ «да», но случится это в отдаленной перспективе, примерно через год. Сначала необходимо решить более важные задачи. Не переживайте, небольшое ожидание пойдет вам на пользу.");
        set.add("Ответ «да». Сегодня вам повезло, но торопитесь, уже завтра обстоятельства могут существенно измениться. Нужно ковать железо пока оно горячо.");
        set.add("Ответ «нет», так как это сейчас небезопасно для вас и ваших близких. Подумайте еще раз, так ли вам необходимо то, о чем вы спрашиваете. Всегда есть возможность решить вопрос другим путем.");
        set.add("Ответ «да», вы этого достойны. Вы вложили много сил, энергии и времени. Пространство справедливо вознаграждает вас по заслугам.");
        set.add("Ответ «нет», потому что вопрос задан преждевременно. Обстоятельства пока не сложились нужным образом. Следует немного подождать. Рекомендуем повторить гадание через три дня.");
        set.add("Ответ «да», если вы попросите помощь у родственников или близких друзей. Не пытайтесь все решить в одиночку. Сейчас люди готовы оказать вам всестороннюю поддержку.");
        set.add("Ответ «да». По большому счету, в гадании не было необходимости. Вы сами знаете ответ на Ваш вопрос. Доверяйте вашей интуиции, она вас не подводит.");
        return set;
    }

    @Contract(pure = true)
    private @NotNull HashMap<String, String> reConnectColor(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Белый", "Скорее всего, вы поторопились - ситуация, о которой вы спрашиваете, еще не успела сложиться. Сделайте небольшой перерыв в делах и действиях и повторите гадание через некоторое время.");
        map.put("Черный", "Этот цвет символизирует полное отрицание. Не стоит играть с судьбой и предпринимать после гадания решительные действия. Впереди вас ожидает полоса препятствий, преодолев которые вы добьетесь счастья и благополучия.");
        map.put("Красный", "Будьте готовы к возникновению конфликтных ситуаций, к агрессии окружающих, к препятствиям на пути к достижению поставленной цели. Помехи создаются соперниками и недоброжелателями. Запаситесь терпением и твердо следуйте по выбранному пути.");
        map.put("Оранжевый", "Путь к достижению цели открыт, но для положительного результата надо приложить максимум усилий. Не стоит рисковать - оранжевый предупреждает, что имеется вероятность крупных потерь и неприятностей.");
        map.put("Желтый", "Вам надо ориентироваться исключительно на разум и быть последовательным в поступках. Избегайте любых конфликтов.");
        map.put("Зеленый", "Ждите серьезных перемен в жизни. У вас появятся возможности реализовать свои планы, касающиеся романтических отношений и семьи. Также зеленый поддерживает все начинания.");
        map.put("Синий", "Вас ожидает успешный период в жизни. Все, за что вы возьметесь в ближайшее время, принесет успех и прибыль. Риск оправдан.");
        map.put("Голубой", "Судьба благоприятствует развитию новых романтических отношений. Коммерческая деятельность приведет к успеху и прибыли. В вопросах бизнеса, семьи и здоровья можете рассчитывать на чужую помощь.");
        map.put("Фиолетовый", "В вашей жизни наступил период, когда следует затаиться и не проявлять активности. Все начинания желательно отложить на более позднее время. Не проявляйте инициативу.");
        return map;
    }

    @Contract(pure = true)
    private @NotNull HashMap<Integer, String> reConnectNumber(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Сегодня прекрасный день для какой-то деятельности, для осуществления чего-то задуманного. Вы проснетесь утром, полным сил и честолюбивых планов,— вы готовы начать день, и сегодня вы превзойдете всех на свете!");
        map.put(2, "Пусть сегодня право решающего голоса достается другим — вашему шефу, партнеру, друзьям, супругу или супруге. Пусть вы динамичный по природе человек — сбавьте шаг и дайте другим возможность проявить себя. Возможно, вы заметите какую-то грань, которая прежде ускользала от вашего взгляда.");
        map.put(3, "Сегодня торжествует личное начало — вы будете сверкать звездой первой величины. Не растрачивайте время и внимание попусту, хотя праздничность дня и вводит в такой соблазн. Силы самовыражения и привлекательности, доминирующие в третий персональный день, следует направить на достижение поставленных вами целей. ");
        map.put(4, "На повестке дня работа, поэтому забудьте про развлечения. Возьмитесь за дела, до которых прежде не доходили руки. У вас появятся силы и мотивы сделать все то, что вы обычно откладывали из-за отсутствия интереса. Все ваши усилия окупятся в будущем.");
        map.put(5, "Не удивляйтесь, если назначенная на сегодняшний день встреча вдруг будет отменена, ведь суть «пятерки» — изменчивость и действие. Однако, зная о природе пятого персонального дня, вы не расстроитесь, воспримете смену планов беззаботно и приметесь за что-то иное. Вы будете вознаграждены, потому что в этот день одно теряют, другое находят — опять же совершенно неожиданно.");
        map.put(6, "Это должен быть день умиротворения, вы насладитесь им в высшей степени, если просто прислушаетесь к интуиции. Сегодня на первом месте будет дом и семья. Невзгоды сегодня отступят, а те, кем вы дорожите, порадуются, видя вас таким счастливым.");
        map.put(7, "Это единственный в девятидневном цикле день, когда следует хранить покой, оставаясь в одиночестве. Глубокие размышления — вот ключ к этому дню, а поэтому, оставшись наедине с собой, воспользуйтесь случаем и обдумайте текущие проблемы, свое настоящее и желаемое будущее. Четкая работа мысли и последующие выводы и решения помогут вам разобраться в себе и выбраться на верную дорогу к успеху.");
        map.put(8, "Не теряйте ни минуты в этот день материального успеха. Вы проснулись утром, чтобы насладиться всеми благами; пусть от зари до зари вам не изменяет хорошее настроение, ведь пришел самый удачный в финансовом отношении день цикла. Если вы упорно трудитесь над осуществлением какого-то плана, то сегодня как раз тот день, когда можно пожинать плоды.");
        map.put(9, "Вам следует навести порядок во всем и подготовиться к совершенно новому циклу, который начинается завтра, с первого персонального дня. Откажитесь от всяких начинаний, которые не приносят желаемых результатов и кажутся бесперспективными.");
        return map;
    }

    @Contract(pure = true)
    private @NotNull Set<String> reConnectCookie(){
        Set<String> set = new HashSet<>();
        set.add("Каждый день — чистая страница жизни. Напиши ее красивым почерком");
        set.add("Помни, счастье — это результат хорошей организации личного времени и пространства");
        set.add("Не знаешь, что делать — сделай уборку. Это всегда помогает!");
        set.add("Чудеса случаются. Особенно если хорошо над ними поработать");
        set.add("Не надо быть великим, чтобы начать, но надо начать, чтобы быть великим");
        set.add("Порадуйся тому, что у тебя есть, и стремись к большему");
        set.add("Мечтай масштабно. Но прямо сейчас сделай крошечный шаг к мечте");
        set.add("Если чувствуешь, что это твое, никого не слушай — рискни!");
        set.add("Вселенная слышит и понимает тебя. Не торопи события");
        set.add("Помни, каждый вечер кто-то важный мысленно желает тебе спокойной ночи, И ты пожелай...");
        set.add("Все может измениться за один день. Если только искренне захотеть");
        set.add("Не позволяй плохим дням внушить тебе, что плоха сама жизнь");
        set.add("Не бойся, что не получится, бойся лишь не попробовать");
        set.add("Помни, все, что ты можешь вообразить — реально!");
        set.add("Хочешь найти новый путь — прямо сейчас сойди со старой дороги");
        set.add("Прежде чем принять окончательное решение, обдумай все еще один разок");
        set.add("Всегда что-то кажется невозможны пока это не будет сделано. Рискни!");
        set.add("Помни, что терпение — это последний ключ, открывающий все двери");
        set.add("Капля лени переносит море работы на завтра. Сделай что-то важное прямо сейчас");
        set.add("Дойдя до конца, не останавливайся — это начало чего-то нового");
        set.add("Найди того, с кем захочешь стать немного лучше, чем вчера");
        set.add("Кто-то прямо сейчас рассчитывает на твою поддержку. Не отказывай");
        set.add("Только ты определяешь пределы своих возможностей. Не ограничивай себя!");
        set.add("Всем сложно, всем некогда, а ты сделай то, что так давно планируешь!");
        set.add("Цени неудачи — это возможность начать снова, но более мудро");
        set.add("Сделай жизнь вокруг себя красивой. Пусть каждый почувствует, что встреча с тобой — это дар");
        set.add("Не наводи порядок в том, отчего нужно избавиться");
        set.add("Не нужно учиться делать что-то лучше всех, нужно научиться делать что-то по-своему хорошо");
        set.add("У тебя есть все, чтобы осуществить свою мечту прямо сейчас");
        set.add("Один день, проведенный в новом месте, дает больше, чем 10 лет, проведенные дома");
        return set;
    }

    @Override
    public String getYesNo() {
        Set<String> alignment = reConnectYesNo();
        return alignment.stream().findAny().get();
    }

    @Override
    public Map<String, String> getColor() {
        HashMap<String, String> colors = reConnectColor();
        Set<String> set = Set.of("Белый", "Черный", "Красный", "Оранжевый", "Желтый", "Зеленый", "Синий", "Голубой ", "Фиолетовый");
        List<String> list = new ArrayList<>(set);
        int randIdx = new Random().nextInt(list.size());
        String color = list.get(randIdx);
        String desc = colors.get(color);
        return Map.of(color, desc);
    }

    @Override
    public Map<Integer, String> getNumber() {
        HashMap<Integer, String> numbers = reConnectNumber();
        int number = new Random().nextInt(numbers.size());
        String desc = numbers.get(number);
        return Map.of(number, desc);
    }

    @Override
    public String getCookie() {
        Set<String> cookies = reConnectCookie();
        return cookies.stream().findAny().get();
    }
}
