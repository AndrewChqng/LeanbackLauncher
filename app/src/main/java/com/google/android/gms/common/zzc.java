package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzc
  extends zza
{
  public static final Parcelable.Creator<zzc> CREATOR = new zzd();
  public final String name;
  public final int version;
  
  public zzc(String paramString, int paramInt)
  {
    this.name = paramString;
    this.version = paramInt;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /home/evan/Downloads/fugu-opr2.170623.027-factory-d4be396e/fugu-opr2.170623.027/image-fugu-opr2.170623.027/TVLauncher/TVLauncher/TVLauncher-dex2jar.jar!/com/google/android/gms/common/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */