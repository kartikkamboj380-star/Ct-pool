.class Lcom/facebook/imagepipeline/nativecode/DalvikPurgeableDecoder$OreoUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/facebook/soloader/f;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/nativecode/DalvikPurgeableDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OreoUtils"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    invoke-static {}, Lcom/facebook/imagepipeline/nativecode/a;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/imagepipeline/nativecode/b;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/imagepipeline/nativecode/c;->a(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    return-void
.end method
