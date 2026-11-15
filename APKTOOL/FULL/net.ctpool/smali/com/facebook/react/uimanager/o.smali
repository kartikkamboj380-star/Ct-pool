.class public final Lcom/facebook/react/uimanager/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/o;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/o;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/o;->a:Lcom/facebook/react/uimanager/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(FF)Z
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sub-float/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const p1, 0x3727c5ac    # 1.0E-5f

    cmpg-float p0, p0, p1

    if-gez p0, :cond_2

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    return v1
.end method
