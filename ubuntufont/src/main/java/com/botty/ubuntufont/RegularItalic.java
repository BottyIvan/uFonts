package com.botty.ubuntufont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.botty.ubuntufont.Typefaces;

/**
 * Created by BottyIvan on 01/10/15.
 */
public class RegularItalic extends TextView {

    public RegularItalic(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context);
    }

    public RegularItalic(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public RegularItalic(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context c)
    {
        setTypeface(Typefaces.get(getContext(), "font/Ubuntu-RI.ttf"));
    }

}