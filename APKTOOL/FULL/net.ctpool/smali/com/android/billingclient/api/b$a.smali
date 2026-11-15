.class public final Lcom/android/billingclient/api/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private volatile a:Lcom/android/billingclient/api/f;

.field private final b:Landroid/content/Context;

.field private volatile c:LC0/i;

.field private volatile d:Z

.field private volatile e:Z


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;LC0/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/b$a;->b:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/b;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/android/billingclient/api/b$a;->b:Landroid/content/Context;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/android/billingclient/api/b$a;->c:LC0/i;

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lcom/android/billingclient/api/b$a;->d:Z

    if-nez v1, :cond_1

    iget-boolean v1, v0, Lcom/android/billingclient/api/b$a;->e:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Please provide a valid listener for purchases updates."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    new-instance v1, Lcom/android/billingclient/api/c;

    iget-object v2, v0, Lcom/android/billingclient/api/b$a;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3, v3}, Lcom/android/billingclient/api/c;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lcom/android/billingclient/api/b$a;->a:Lcom/android/billingclient/api/f;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/android/billingclient/api/b$a;->a:Lcom/android/billingclient/api/f;

    invoke-virtual {v1}, Lcom/android/billingclient/api/f;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/android/billingclient/api/b$a;->c:LC0/i;

    if-eqz v1, :cond_3

    new-instance v1, Lcom/android/billingclient/api/c;

    iget-object v4, v0, Lcom/android/billingclient/api/b$a;->a:Lcom/android/billingclient/api/f;

    iget-object v5, v0, Lcom/android/billingclient/api/b$a;->b:Landroid/content/Context;

    iget-object v6, v0, Lcom/android/billingclient/api/b$a;->c:LC0/i;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/android/billingclient/api/c;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/f;Landroid/content/Context;LC0/i;LC0/u;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_3
    new-instance v1, Lcom/android/billingclient/api/c;

    iget-object v12, v0, Lcom/android/billingclient/api/b$a;->a:Lcom/android/billingclient/api/f;

    iget-object v13, v0, Lcom/android/billingclient/api/b$a;->b:Landroid/content/Context;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v16}, Lcom/android/billingclient/api/c;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/f;Landroid/content/Context;LC0/A;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V

    :goto_1
    return-object v1

    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Pending purchases for one-time products must be supported."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Please provide a valid Context."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b()Lcom/android/billingclient/api/b$a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->b()Lcom/android/billingclient/api/f$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/billingclient/api/b$a;->c(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/b$a;

    return-object p0
.end method

.method public c(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/b$a;->a:Lcom/android/billingclient/api/f;

    return-object p0
.end method

.method public d(LC0/i;)Lcom/android/billingclient/api/b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/b$a;->c:LC0/i;

    .line 2
    .line 3
    return-object p0
.end method
