.class public final LF/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF/c;

    .line 2
    .line 3
    invoke-direct {v0}, LF/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF/c;->a:LF/c;

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


# virtual methods
.method public final a(LD/b;Ljava/util/List;LH5/I;Lv5/a;)LC/f;
    .locals 7

    .line 1
    const-string v0, "migrations"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "produceFile"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, LC/g;->a:LC/g;

    .line 17
    .line 18
    sget-object v2, LF/h;->a:LF/h;

    .line 19
    .line 20
    new-instance v6, LF/c$a;

    .line 21
    .line 22
    invoke-direct {v6, p4}, LF/c$a;-><init>(Lv5/a;)V

    .line 23
    .line 24
    .line 25
    move-object v3, p1

    .line 26
    move-object v4, p2

    .line 27
    move-object v5, p3

    .line 28
    invoke-virtual/range {v1 .. v6}, LC/g;->a(LC/k;LD/b;Ljava/util/List;LH5/I;Lv5/a;)LC/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, LF/b;

    .line 33
    .line 34
    invoke-direct {p2, p1}, LF/b;-><init>(LC/f;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method
