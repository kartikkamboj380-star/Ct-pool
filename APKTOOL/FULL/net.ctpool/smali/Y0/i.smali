.class public LY0/i;
.super LY0/a;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LY0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static x()LY0/i;
    .locals 1

    .line 1
    new-instance v0, LY0/i;

    .line 2
    .line 3
    invoke-direct {v0}, LY0/i;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public p(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-super {p0, p1}, LY0/a;->p(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
