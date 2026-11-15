.class public final LT5/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LY5/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    .line 1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, LT5/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    .line 2
    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LY5/h;

    sget-object v2, LX5/e;->h:LX5/e;

    move-object v1, v0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LY5/h;-><init>(LX5/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v0}, LT5/k;-><init>(LY5/h;)V

    return-void
.end method

.method public constructor <init>(LY5/h;)V
    .locals 1

    .line 3
    const-string v0, "delegate"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT5/k;->a:LY5/h;

    return-void
.end method


# virtual methods
.method public final a()LY5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/k;->a:LY5/h;

    .line 2
    .line 3
    return-object v0
.end method
