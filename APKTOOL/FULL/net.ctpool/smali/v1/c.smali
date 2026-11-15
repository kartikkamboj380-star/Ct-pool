.class public final Lv1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv1/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lv1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv1/c;->a:Lv1/c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(LG1/F;LH1/f;Ly1/a;)Lv1/b;
    .locals 1

    .line 1
    const-string v0, "poolFactory"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "platformDecoder"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "closeableReferenceFactory"

    .line 12
    .line 13
    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lv1/a;

    .line 17
    .line 18
    invoke-virtual {p0}, LG1/F;->b()LG1/i;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "poolFactory.bitmapPool"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, Lv1/a;-><init>(LG1/i;Ly1/a;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method
