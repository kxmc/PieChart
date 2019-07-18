package com.github.ccmagic.piechart;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.ccmagic.piechartlib.PieChartView;

import java.util.ArrayList;
import java.util.Random;

/**
 * 主页
 *
 * @author kxmc
 * <a href="http://www.kxmc.top">kxmc.top</a>
 * <a href="http://https://github.com/ccMagic">github(kxmc)</a>
 * @date 19-7-18 15:46
 */
public class MainActivity extends AppCompatActivity {
    private PieChartView pieChartView;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        pieChartView = findViewById(R.id.pieChartView);
    }

    /**
     * 点击update按钮开始绘制，每次随机数更换数值
     */
    public void updateClick(View view) {
        ArrayList<PieChartView.Part> list = new ArrayList<>();
        //这里用随机数配置份儿，只是写入对应的值就行，会根据所有添加的数据进行百分比配置
        list.add(new PieChartView.Part("Lollipop", random.nextInt(100) + 1, Color.RED));
        list.add(new PieChartView.Part("Marshmallow", random.nextInt(100) + 1, Color.BLUE));
        list.add(new PieChartView.Part("Froyo", random.nextInt(100) + 1, Color.YELLOW));
        list.add(new PieChartView.Part("Gingerbread", random.nextInt(100) + 1, Color.GREEN));
        list.add(new PieChartView.Part("Ice Cream Sandwich", random.nextInt(100) + 1, Color.WHITE));
        list.add(new PieChartView.Part("Jelly Bean", random.nextInt(100) + 1, Color.MAGENTA));
        list.add(new PieChartView.Part("KitKat", random.nextInt(100) + 1, Color.LTGRAY));
        pieChartView.setPartsData(list);
    }
}
