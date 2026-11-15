.class public Lcom/android/billingclient/api/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/d$c;,
        Lcom/android/billingclient/api/d$a;,
        Lcom/android/billingclient/api/d$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/android/billingclient/api/d$c;

.field private e:Lcom/google/android/gms/internal/play_billing/j;

.field private f:Ljava/util/ArrayList;

.field private g:Z


# direct methods
.method synthetic constructor <init>(LC0/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/android/billingclient/api/d$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/billingclient/api/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/d$a;-><init>(LC0/p;)V

    return-object v0
.end method

.method static bridge synthetic i(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->a:Z

    return-void
.end method

.method static bridge synthetic j(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->g:Z

    return-void
.end method

.method static bridge synthetic k(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic l(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/j;

    return-void
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/d;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->f:Ljava/util/ArrayList;

    return-void
.end method

.method static bridge synthetic o(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/d$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->b()I

    move-result v0

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/android/billingclient/api/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/j;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->g:Z

    return v0
.end method

.method final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->b()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
