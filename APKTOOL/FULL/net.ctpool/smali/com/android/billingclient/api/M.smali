.class final Lcom/android/billingclient/api/M;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LC0/i;

.field private final c:Lcom/android/billingclient/api/x;

.field private final d:Lcom/android/billingclient/api/L;

.field private final e:Lcom/android/billingclient/api/L;

.field private f:Z


# direct methods
.method constructor <init>(Landroid/content/Context;LC0/i;LC0/A;LC0/u;LC0/l;Lcom/android/billingclient/api/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/M;->b:LC0/i;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/android/billingclient/api/M;->c:Lcom/android/billingclient/api/x;

    .line 9
    .line 10
    new-instance p1, Lcom/android/billingclient/api/L;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p1, p0, p2}, Lcom/android/billingclient/api/L;-><init>(Lcom/android/billingclient/api/M;Z)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/billingclient/api/M;->d:Lcom/android/billingclient/api/L;

    .line 17
    .line 18
    new-instance p1, Lcom/android/billingclient/api/L;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-direct {p1, p0, p2}, Lcom/android/billingclient/api/L;-><init>(Lcom/android/billingclient/api/M;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/android/billingclient/api/M;->e:Lcom/android/billingclient/api/L;

    .line 25
    .line 26
    return-void
.end method

.method static bridge synthetic a(Lcom/android/billingclient/api/M;)LC0/u;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static bridge synthetic b(Lcom/android/billingclient/api/M;)Lcom/android/billingclient/api/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/M;->c:Lcom/android/billingclient/api/x;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/android/billingclient/api/M;)LC0/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/M;->b:LC0/i;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(Lcom/android/billingclient/api/M;)LC0/l;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method final d()LC0/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/M;->b:LC0/i;

    .line 2
    .line 3
    return-object v0
.end method

.method final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/M;->d:Lcom/android/billingclient/api/L;

    iget-object v1, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/L;->c(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/android/billingclient/api/M;->e:Lcom/android/billingclient/api/L;

    iget-object v1, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/L;->c(Landroid/content/Context;)V

    return-void
.end method

.method final g(Z)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v2, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/android/billingclient/api/M;->f:Z

    iget-object p1, p0, Lcom/android/billingclient/api/M;->e:Lcom/android/billingclient/api/L;

    iget-object v2, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    invoke-virtual {p1, v2, v1}, Lcom/android/billingclient/api/L;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    iget-boolean p1, p0, Lcom/android/billingclient/api/M;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/M;->d:Lcom/android/billingclient/api/L;

    iget-object v1, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    const-string v2, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    invoke-virtual {p1, v1, v0, v2}, Lcom/android/billingclient/api/L;->b(Landroid/content/Context;Landroid/content/IntentFilter;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/M;->d:Lcom/android/billingclient/api/L;

    iget-object v1, p0, Lcom/android/billingclient/api/M;->a:Landroid/content/Context;

    invoke-virtual {p1, v1, v0}, Lcom/android/billingclient/api/L;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method
