package mudclient;

import java.io.InputStream;

// $FF: renamed from: a.a.d
public class StreamAudioPlayer extends InputStream {

   // $FF: renamed from: a byte[]
   byte[] field_817;
   // $FF: renamed from: b int
   int field_818;
   // $FF: renamed from: c int
   int field_819;


   // $FF: renamed from: <init> () void
   public StreamAudioPlayer() {
      super();
   }

   // $FF: renamed from: a () void
   public void method_318() {
   }

   // $FF: renamed from: a (byte[], int, int) void
   public void writeStream(byte[] var1, int var2, int var3) {
      this.field_817 = var1;
      this.field_818 = var2;
      this.field_819 = var2 + var3;
   }

   public int read(byte[] var1, int var2, int var3) {
      boolean var5 = Surface.field_759;
      int var4 = 0;
      if(!var5 && var4 >= var3) {
         return var3;
      } else {
         do {
            label16: {
               if(this.field_818 < this.field_819) {
                  var1[var2 + var4] = this.field_817[this.field_818++];
                  if(!var5) {
                     break label16;
                  }
               }

               var1[var2 + var4] = -1;
            }

            ++var4;
         } while(var4 < var3);

         return var3;
      }
   }

   public int read() {
      byte[] var1 = new byte[1];
      this.read(var1, 0, 1);
      return var1[0];
   }
}
