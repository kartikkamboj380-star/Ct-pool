.class public final LM2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LM2/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LM2/c$a;Landroid/graphics/Paint;IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LM2/c$a;->b(Landroid/graphics/Paint;IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b(Landroid/graphics/Paint;IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p2, p3, p5, p6}, Lcom/facebook/react/views/text/o;->a(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string p3, "applyStyles(...)"

    .line 10
    .line 11
    invoke-static {p2, p3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
