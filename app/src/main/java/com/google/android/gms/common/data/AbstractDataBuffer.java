package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer<T>
  implements DataBuffer<T>
{
  protected final DataHolder zzaML;
  
  protected AbstractDataBuffer(DataHolder paramDataHolder)
  {
    this.zzaML = paramDataHolder;
  }
  
  @Deprecated
  public final void close()
  {
    release();
  }
  
  public abstract T get(int paramInt);
  
  public int getCount()
  {
    if (this.zzaML == null) {
      return 0;
    }
    return this.zzaML.getCount();
  }
  
  @Deprecated
  public boolean isClosed()
  {
    return (this.zzaML == null) || (this.zzaML.isClosed());
  }
  
  public Iterator<T> iterator()
  {
    return new zzb(this);
  }
  
  public void release()
  {
    if (this.zzaML != null) {
      this.zzaML.close();
    }
  }
  
  public Iterator<T> singleRefIterator()
  {
    return new zzg(this);
  }
  
  public Bundle zzwW()
  {
    return this.zzaML.zzwW();
  }
}


/* Location:              /home/evan/Downloads/fugu-opr2.170623.027-factory-d4be396e/fugu-opr2.170623.027/image-fugu-opr2.170623.027/TVLauncher/TVLauncher/TVLauncher-dex2jar.jar!/com/google/android/gms/common/data/AbstractDataBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */