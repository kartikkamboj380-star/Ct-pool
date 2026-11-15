.class public Lt4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lu4/c;

.field private final b:Lu4/a;


# direct methods
.method public constructor <init>(Lu4/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lt4/c;->b:Lu4/a;

    .line 8
    .line 9
    iput-object p1, p0, Lt4/c;->a:Lu4/c;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Lu4/a;->w()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p1, v0, v1}, Lu4/a;->h1(J)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iput-object p1, p0, Lt4/c;->b:Lu4/a;

    .line 34
    .line 35
    new-instance v0, Lu4/c;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lu4/c;-><init>(Lu4/a;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lt4/c;->a:Lu4/c;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/c;->b:Lu4/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lu4/a;->a0()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_1
    return-object v1
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/c;->b:Lu4/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lu4/a;->H0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/c;->a:Lu4/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lu4/c;->a()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
