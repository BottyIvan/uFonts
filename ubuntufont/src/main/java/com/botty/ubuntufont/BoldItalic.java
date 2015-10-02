package com.botty.ubuntufont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by BottyIvan on 01/10/15.
 */
public class BoldItalic extends TextView {

    public BoldItalic(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context);
    }

    public BoldItalic(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public BoldItalic(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context c)
    {
        setTypeface(Typefaces.get(getContext(), "font/Ubuntu-BI.ttf"));
    }

}