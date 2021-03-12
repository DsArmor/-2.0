package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class Character {
    public int Health;
    public int Def;
    public int Damage;
    public String name;

    public Character(String name) {
        Health = 100;
        Def = 10;
        Damage = 10;
        this.name = name;
    }
}

//=======ситуация=======
class Situation {
    Situation[] direction;
    String text;
    int dH, dDef, dDam;

    public Situation(String text, int variants, int dh, int dDef, int dDam) {
        this.text = text;
        this.dH = dh;
        this.dDef = dDef;
        this.dDam = dDam;
        direction = new Situation[variants];
    }
}

// =======история=======
class Story {

    private Situation start_story;
    public Situation current_situation;

    Story() {
        start_story = new Situation(

                "Вы просыпаетесь на какой-то планете внутри тьмы(на самом деле вы просто в пещере),\n" +
                        "вокруг вас тишина, когда шум в голове утихает, вы осматриваетесь и видите, что вдалеке виднеется свет,\n" +
                        "вы не понимаете, что это, но это хоть какие-то изменения в окружении,\n" +
                        "поэтому, осознав свою сущность, вы понимаете, что можете двигаться к этому свету\n" +
                        "\t1)Двигаться к свету\n" +
                        "\t2)Остаться в пещере и осмотреть всё внимательно",
                2, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "Вы выбираетесь из темноты.\n" +
                        "Перед глазами открывается огромный мир, деревья, ручьи, райские звуки раздаются со всех сторон.\n" +
                        "Вы облегченно выдыхаете. Кажется, этот мир рад вам\n" +
                        "Спустя некоторое время, вы собираетесь наконец-то пойти осваивать этот бескрайний мир.\n" +
                        "Вы полны решимости. Вы делаете шаг вперед, но горный склон, ведущий вниз, для неокрепшего организма оказался непреодолимым препятствием\n" +
                        "Вы поскальзываетесь и падаете с огромной высоты.",
                0, -1009, -20, -10);
        start_story.direction[1] = new Situation(
                "Вы обшариваете все стены в поисках чего-то, что должно было бы сказать вам о том,\n" +
                        " откуда вы, почему появились в этой пещере и подсказки для следующих действий, но тщетно, тишина начинает на вас давить, а свет все больше манит к себе,\n" +
                        " плюнув на все, вы двигаетесь к свету, но не пройдя и пары шагов, вы вдруг замечаете выступ в стене,\n" +
                        " на котором переливается свет не так, как на всем окружающем. С любопытством вы подходите к нему, дотрагиваетесь\n" +
                        "\t1)Вдавить этот странный камень в стену\n" +
                        "\t2)Бросить это глупое занятие, слишком уж тут тихо и мрачно, вперед к свету\n",
                2, 10, -5, -5);
        start_story.direction[1].direction[0]= new Situation(
                "Вы давите на него, через несколько секунд он с неохотой поддается под вашими усилиями,\n" +
                        "где-то щелкает что-то, а затем стена отходит в сторону, а на вас налетает странный ветер,\n" +
                        "кажется что-то изменилось внутри, вас обуревает страх из-за сгустившейся темноты и страшных звуков доносящихся из глубины прохода\n" +
                        "\t1)Идти внутрь\n" +
                        "\t2)Броситься прочь",
                2, 10, -5, -5);
        start_story.direction[1].direction[1] = new Situation("Вы выбираетесь из темноты.\n" +
                "Перед глазами открывается огромный мир, деревья, ручьи, райские звуки раздаются со всех сторон.\n" +
                "Вы облегченно выдыхаете. Кажется, этот мир рад вам\n" +
                "Спустя некоторое время, вы собираетесь наконец-то пойти осваивать этот бескрайний мир.\n" +
                "Вы полны решимости. Вы делаете шаг вперед, но горный склон, ведущий вниз, для неокрепшего организма оказался непреодолимым препятствием\n" +
                "Вы поскальзываетесь и падаете с огромной высоты.",
                0, -10000, 0, 0);
        start_story.direction[1].direction[0].direction[0] = new Situation(
                "Вы входите внутрь\n" +
                        "свод пещеры смыкается и вы оказываетесь в кромешной темноте\n" +
                        "позднее здесь найдут труп неизвестно существа, умершего от голода",
                0, -10000, 0, 0);
        start_story.direction[1].direction[0].direction[1] = new Situation("Вы выбираетесь из темноты.\n" +
                "Перед глазами открывается огромный мир, деревья, ручьи, райские звуки раздаются со всех сторон.\n" +
                "Вы облегченно выдыхаете. Кажется, этот мир рад вам\n" +
                "Спустя некоторое время, вы собираетесь наконец-то пойти осваивать этот бескрайний мир.\n" +
                "Вы полны решимости. Вы делаете шаг вперед, но горный склон, ведущий вниз, для неокрепшего организма оказался непреодолимым препятствием\n" +
                "Вы поскальзываетесь и падаете с огромной высоты.",
                0, -1000, 0, 0);
        current_situation = start_story;
    }
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
//=======игра=======

public class MainActivity extends AppCompatActivity {

    public static Character hero;
    public static Story story;

    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hero = new Character("Давид");
        story = new Story();
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        newParameter();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { nextSituation(0); }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextSituation(1);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    void nextSituation(int i) {
        TextView t1 = (TextView) findViewById(R.id.textView1);
        if (story.isEnd()) {
            t1.setText("The End");
        } else {
            story.current_situation = story.current_situation.direction[i];
            newParameter();
        }
    }
    @SuppressLint("SetTextI18n")
    void newParameter(){
        TextView t1 = (TextView) findViewById(R.id.textView1);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        hero.Health += story.current_situation.dH;
        hero.Def += story.current_situation.dDef;
        hero.Damage += story.current_situation.dDam;
        t2.setText("Health: " + hero.Health + "\nDefence: " + hero.Def + "\nDamage: " + hero.Damage);
        t1.setText(story.current_situation.text);
    }
}



