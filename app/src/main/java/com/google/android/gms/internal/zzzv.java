package com.google.android.gms.internal;

import android.app.Fragment;
import android.os.Bundle;
import com.google.android.gms.common.api.ResultStore;

public class zzzv
  extends Fragment
{
  private zzaae zzaOz = new zzaae();
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRetainInstance(true);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.zzaOz.zzx(getActivity());
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.zzaOz.zzyM();
  }
  
  public ResultStore zzyJ()
  {
    return this.zzaOz;
  }
}


/* Location:              /home/evan/Downloads/fugu-opr2.170623.027-factory-d4be396e/fugu-opr2.170623.027/image-fugu-opr2.170623.027/TVLauncher/TVLauncher/TVLauncher-dex2jar.jar!/com/google/android/gms/internal/zzzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */