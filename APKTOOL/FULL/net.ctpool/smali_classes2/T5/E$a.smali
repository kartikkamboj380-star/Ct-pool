.class public final LT5/E$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT5/E;
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
    invoke-direct {p0}, LT5/E$a;-><init>()V

    return-void
.end method

.method public static synthetic d(LT5/E$a;[BLT5/x;ILjava/lang/Object;)LT5/E;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, LT5/E$a;->c([BLT5/x;)LT5/E;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a(LT5/x;JLi6/h;)LT5/E;
    .locals 1

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p4, p1, p2, p3}, LT5/E$a;->b(Li6/h;LT5/x;J)LT5/E;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final b(Li6/h;LT5/x;J)LT5/E;
    .locals 1

    .line 1
    const-string v0, "$this$asResponseBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LT5/E$a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3, p4}, LT5/E$a$a;-><init>(Li6/h;LT5/x;J)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c([BLT5/x;)LT5/E;
    .locals 3

    .line 1
    const-string v0, "$this$toResponseBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li6/f;

    .line 7
    .line 8
    invoke-direct {v0}, Li6/f;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Li6/f;->r1([B)Li6/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    array-length p1, p1

    .line 16
    int-to-long v1, p1

    .line 17
    invoke-virtual {p0, v0, p2, v1, v2}, LT5/E$a;->b(Li6/h;LT5/x;J)LT5/E;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
