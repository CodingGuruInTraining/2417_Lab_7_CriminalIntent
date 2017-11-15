package com.mark.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Fragment
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
