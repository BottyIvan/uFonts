package com.botty.ubuntufont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by BottyIvan on 01/10/15.
 */
public class Medium extends TextView {

    public Medium(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context);
    }

    public Medium(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public Medium(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context c)
    {
        setTypeface(Typefaces.get(getContext(), "font/Ubuntu-M.ttf"));
    }

}
