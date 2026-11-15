.class LX4/c;
.super LR4/q;
.source "SourceFile"


# static fields
.field static final b:LR4/r;


# instance fields
.field private final a:LR4/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LX4/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, LX4/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX4/c;->b:LR4/r;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(LR4/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR4/q;-><init>()V

    iput-object p1, p0, LX4/c;->a:LR4/q;

    return-void
.end method

.method synthetic constructor <init>(LR4/q;LX4/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LX4/c;-><init>(LR4/q;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY4/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX4/c;->e(LY4/a;)Ljava/sql/Timestamp;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(LY4/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/sql/Timestamp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LX4/c;->f(LY4/c;Ljava/sql/Timestamp;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LY4/a;)Ljava/sql/Timestamp;
    .locals 3

    .line 1
    iget-object v0, p0, LX4/c;->a:LR4/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR4/q;->b(LY4/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Date;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/sql/Timestamp;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return-object v0
.end method

.method public f(LY4/c;Ljava/sql/Timestamp;)V
    .locals 1

    .line 1
    iget-object v0, p0, LX4/c;->a:LR4/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
