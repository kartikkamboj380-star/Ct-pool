.class public final Ly1/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/n$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;LR0/a;LB1/c;LB1/e;Ly1/e;ZZLy1/g;LR0/i;LR0/l;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lv1/b;IIZILy1/a;ZI)Ly1/s;
    .locals 26

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    move-object/from16 v16, p17

    move/from16 v17, p18

    move/from16 v18, p19

    move/from16 v19, p20

    move/from16 v20, p21

    move-object/from16 v21, p22

    move/from16 v22, p23

    move/from16 v23, p24

    .line 1
    const-string v0, "context"

    move-object/from16 v24, v1

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "byteArrayPool"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageDecoder"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressiveJpegConfig"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downsampleMode"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executorSupplier"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pooledByteBufferFactory"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pooledByteStreams"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapMemoryCache"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodedMemoryCache"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultBufferedDiskCache"

    move-object/from16 v1, p13

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smallImageBufferedDiskCache"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheKeyFactory"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformBitmapFactory"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeableReferenceFactory"

    move-object/from16 v1, p22

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v25, Ly1/s;

    move-object/from16 v0, v25

    move-object/from16 v1, v24

    invoke-direct/range {v0 .. v23}, Ly1/s;-><init>(Landroid/content/Context;LR0/a;LB1/c;LB1/e;Ly1/e;ZZLy1/g;LR0/i;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lv1/b;IIZILy1/a;ZI)V

    return-object v25
.end method
