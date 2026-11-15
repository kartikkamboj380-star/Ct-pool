.class Lcom/android/billingclient/api/c;
.super Lcom/android/billingclient/api/b;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Ljava/util/concurrent/ExecutorService;

.field private volatile a:I

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/Handler;

.field private volatile d:Lcom/android/billingclient/api/M;

.field private e:Landroid/content/Context;

.field private f:Lcom/android/billingclient/api/x;

.field private volatile g:Lcom/google/android/gms/internal/play_billing/J2;

.field private volatile h:Lcom/android/billingclient/api/u;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Lcom/android/billingclient/api/f;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/b;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/c;->a:I

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/c;->k:I

    invoke-static {}, Lcom/android/billingclient/api/c;->S()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m2;->D()Lcom/google/android/gms/internal/play_billing/l2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/l2;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/l2;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/m2;

    new-instance p3, Lcom/android/billingclient/api/z;

    invoke-direct {p3, p1, p2}, Lcom/android/billingclient/api/z;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/m2;)V

    iput-object p3, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/f;Landroid/content/Context;LC0/A;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    .line 3
    invoke-direct {p0}, Lcom/android/billingclient/api/b;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/c;->a:I

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/c;->k:I

    invoke-static {}, Lcom/android/billingclient/api/c;->S()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m2;->D()Lcom/google/android/gms/internal/play_billing/l2;

    move-result-object p1

    invoke-static {}, Lcom/android/billingclient/api/c;->S()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/l2;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    iget-object p3, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/l2;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    iget-object p3, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/m2;

    new-instance p4, Lcom/android/billingclient/api/z;

    invoke-direct {p4, p3, p1}, Lcom/android/billingclient/api/z;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/m2;)V

    iput-object p4, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    const-string p1, "BillingClient"

    const-string p3, "Billing client should have a valid listener but the provided is null."

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/M;

    iget-object v1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/M;-><init>(Landroid/content/Context;LC0/i;LC0/A;LC0/u;LC0/l;Lcom/android/billingclient/api/x;)V

    iput-object p1, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    iput-object p2, p0, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/f;Landroid/content/Context;LC0/i;LC0/u;Lcom/android/billingclient/api/x;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    .line 2
    invoke-static {}, Lcom/android/billingclient/api/c;->S()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/android/billingclient/api/b;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/c;->a:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/c;->k:I

    iput-object v5, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/c;->l(Landroid/content/Context;LC0/i;Lcom/android/billingclient/api/f;LC0/u;Ljava/lang/String;Lcom/android/billingclient/api/x;)V

    return-void
.end method

.method static bridge synthetic A(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->j:Z

    return-void
.end method

.method static bridge synthetic B(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->i:Z

    return-void
.end method

.method static bridge synthetic C(Lcom/android/billingclient/api/c;Lcom/google/android/gms/internal/play_billing/S1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    return-void
.end method

.method static bridge synthetic H(Lcom/android/billingclient/api/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/billingclient/api/c;->k:I

    return p0
.end method

.method static bridge synthetic K(Lcom/android/billingclient/api/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/billingclient/api/c;->x:Z

    return p0
.end method

.method static bridge synthetic L(Lcom/android/billingclient/api/c;Ljava/lang/String;I)LC0/D;
    .locals 17

    move-object/from16 v1, p0

    .line 1
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Querying owned items, item type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "BillingClient"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v3, v1, Lcom/android/billingclient/api/c;->n:Z

    iget-boolean v4, v1, Lcom/android/billingclient/api/c;->v:Z

    iget-object v5, v1, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v5}, Lcom/android/billingclient/api/f;->a()Z

    move-result v5

    iget-object v6, v1, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v6}, Lcom/android/billingclient/api/f;->b()Z

    move-result v6

    iget-object v7, v1, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    invoke-static {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/play_billing/A;->c(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    move-object v12, v4

    :goto_0
    const/16 v5, 0x9

    :try_start_0
    iget-boolean v6, v1, Lcom/android/billingclient/api/c;->n:Z

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    iget-object v8, v1, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-boolean v6, v1, Lcom/android/billingclient/api/c;->v:Z

    if-eq v7, v6, :cond_0

    move v9, v5

    goto :goto_1

    :cond_0
    const/16 v6, 0x13

    move v9, v6

    :goto_1
    iget-object v6, v1, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    move-object v13, v3

    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/J2;->Z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    move-object/from16 v10, p1

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    iget-object v6, v1, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-object v8, v1, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x3

    move-object/from16 v10, p1

    invoke-interface {v6, v9, v8, v10, v12}, Lcom/google/android/gms/internal/play_billing/J2;->z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    const-string v8, "getPurchase()"

    invoke-static {v6, v2, v8}, Lcom/android/billingclient/api/K;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/J;

    move-result-object v8

    invoke-virtual {v8}, Lcom/android/billingclient/api/J;->a()Lcom/android/billingclient/api/e;

    move-result-object v9

    sget-object v11, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    if-eq v9, v11, :cond_2

    invoke-virtual {v8}, Lcom/android/billingclient/api/J;->b()I

    move-result v0

    invoke-static {v0, v5, v9}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    new-instance v0, LC0/D;

    invoke-direct {v0, v9, v4}, LC0/D;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto/16 :goto_6

    :cond_2
    const-string v8, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v9, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string v11, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v6, v11}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v12, v14, :cond_4

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "Sku is owned: "

    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v4, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v4, v14, v15}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v4}, Lcom/android/billingclient/api/Purchase;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "BUG: empty/null token!"

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v13, 0x1

    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v3, "Got an exception trying to decode the purchase!"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    const/16 v2, 0x33

    invoke-static {v2, v5, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    new-instance v1, LC0/D;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LC0/D;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    :goto_4
    move-object v0, v1

    goto :goto_6

    :cond_4
    if-eqz v13, :cond_5

    const/16 v4, 0x1a

    sget-object v7, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    invoke-static {v4, v5, v7}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    :cond_5
    const-string v4, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Continuation token: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v1, LC0/D;

    sget-object v2, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    invoke-direct {v1, v2, v0}, LC0/D;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    goto/16 :goto_0

    :goto_5
    sget-object v3, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    const/16 v4, 0x34

    invoke-static {v4, v5, v3}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    const-string v1, "Got exception trying to get purchasesm try to reconnect"

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, LC0/D;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, LC0/D;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    :goto_6
    return-object v0
.end method

.method static synthetic M(Lcom/android/billingclient/api/c;IILcom/android/billingclient/api/e;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    return-void
.end method

.method static synthetic N(Lcom/android/billingclient/api/c;I)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    invoke-static {p1}, Lcom/android/billingclient/api/w;->c(I)Lcom/google/android/gms/internal/play_billing/W1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/c;->V(Lcom/google/android/gms/internal/play_billing/W1;)V

    return-void
.end method

.method private final O()Landroid/os/Handler;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    return-object v0
.end method

.method private final P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/N;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/N;-><init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method private final Q()Lcom/android/billingclient/api/e;
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/billingclient/api/c;->a:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/android/billingclient/api/c;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    :goto_1
    return-object v0
.end method

.method private final R(Lcom/android/billingclient/api/h;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 p1, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static S()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    const-class v0, LD0/a;

    const-string v1, "VERSION_NAME"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "7.0.0"

    return-object v0
.end method

.method private final T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->B:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/A;->a:I

    new-instance v1, Lcom/android/billingclient/api/p;

    invoke-direct {v1, p0}, Lcom/android/billingclient/api/p;-><init>(Lcom/android/billingclient/api/c;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/c;->B:Ljava/util/concurrent/ExecutorService;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/c;->B:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p2, p2

    new-instance v0, LC0/O;

    invoke-direct {v0, p1, p4}, LC0/O;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    const-wide v1, 0x3fee666666666666L    # 0.95

    mul-double/2addr p2, v1

    double-to-long p2, p2

    invoke-virtual {p5, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Async task throws exception!"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final U(Lcom/google/android/gms/internal/play_billing/S1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    iget v1, p0, Lcom/android/billingclient/api/c;->k:I

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/x;->d(Lcom/google/android/gms/internal/play_billing/S1;I)V

    return-void
.end method

.method private final V(Lcom/google/android/gms/internal/play_billing/W1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    iget v1, p0, Lcom/android/billingclient/api/c;->k:I

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/x;->b(Lcom/google/android/gms/internal/play_billing/W1;I)V

    return-void
.end method

.method private final W(Ljava/lang/String;LC0/g;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0xb

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    :goto_0
    invoke-static {v0, v2, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, p1, v1}, LC0/g;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v4, Lcom/android/billingclient/api/r;

    .line 25
    .line 26
    invoke-direct {v4, p0, p1, p2}, Lcom/android/billingclient/api/r;-><init>(Lcom/android/billingclient/api/c;Ljava/lang/String;LC0/g;)V

    .line 27
    .line 28
    .line 29
    new-instance v7, Lcom/android/billingclient/api/l;

    .line 30
    .line 31
    invoke-direct {v7, p0, p2}, Lcom/android/billingclient/api/l;-><init>(Lcom/android/billingclient/api/c;LC0/g;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    const-wide/16 v5, 0x7530

    .line 39
    .line 40
    move-object v3, p0

    .line 41
    invoke-direct/range {v3 .. v8}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/16 v0, 0x19

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method private final X(Ljava/lang/String;LC0/h;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    :goto_0
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j;->q()Lcom/google/android/gms/internal/play_billing/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p2, p1, v0}, LC0/h;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const-string p1, "BillingClient"

    .line 34
    .line 35
    const-string v0, "Please provide a valid product type."

    .line 36
    .line 37
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lcom/android/billingclient/api/y;->g:Lcom/android/billingclient/api/e;

    .line 41
    .line 42
    const/16 v0, 0x32

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v3, Lcom/android/billingclient/api/q;

    .line 46
    .line 47
    invoke-direct {v3, p0, p1, p2}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/c;Ljava/lang/String;LC0/h;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lcom/android/billingclient/api/i;

    .line 51
    .line 52
    invoke-direct {v6, p0, p2}, Lcom/android/billingclient/api/i;-><init>(Lcom/android/billingclient/api/c;LC0/h;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const-wide/16 v4, 0x7530

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/16 v0, 0x19

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-void
.end method

.method private final Y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v0}, Lcom/android/billingclient/api/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final Z(Lcom/android/billingclient/api/e;II)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Unable to create logging payload"

    const-string v3, "BillingLogger"

    const/4 v4, 0x5

    if-eqz v0, :cond_0

    sget v0, Lcom/android/billingclient/api/w;->a:I

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S1;->E()Lcom/google/android/gms/internal/play_billing/R1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/c2;->E()Lcom/google/android/gms/internal/play_billing/Y1;

    move-result-object v5

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/play_billing/Y1;->q(I)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/play_billing/Y1;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {v5, p2}, Lcom/google/android/gms/internal/play_billing/Y1;->r(I)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/play_billing/R1;->m(Lcom/google/android/gms/internal/play_billing/Y1;)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/play_billing/R1;->q(I)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t2;->B()Lcom/google/android/gms/internal/play_billing/r2;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/r2;->m(I)Lcom/google/android/gms/internal/play_billing/r2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/t2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/R1;->p(Lcom/google/android/gms/internal/play_billing/t2;)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/S1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    return-void

    :cond_0
    sget p1, Lcom/android/billingclient/api/w;->a:I

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/W1;->C()Lcom/google/android/gms/internal/play_billing/V1;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/play_billing/V1;->p(I)Lcom/google/android/gms/internal/play_billing/V1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t2;->B()Lcom/google/android/gms/internal/play_billing/r2;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/r2;->m(I)Lcom/google/android/gms/internal/play_billing/r2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/t2;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/V1;->m(Lcom/google/android/gms/internal/play_billing/t2;)Lcom/google/android/gms/internal/play_billing/V1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/W1;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, p1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {v3, v2, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->V(Lcom/google/android/gms/internal/play_billing/W1;)V

    return-void
.end method

.method static bridge synthetic a0(Lcom/android/billingclient/api/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic d0(Lcom/android/billingclient/api/c;)Landroid/os/Handler;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e0(Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/M;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    return-object p0
.end method

.method static bridge synthetic f0(Lcom/android/billingclient/api/c;Ljava/lang/String;)Lcom/android/billingclient/api/v;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Querying purchase history, item type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "BillingClient"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v3, v1, Lcom/android/billingclient/api/c;->n:Z

    iget-boolean v4, v1, Lcom/android/billingclient/api/c;->v:Z

    iget-object v5, v1, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v5}, Lcom/android/billingclient/api/f;->a()Z

    move-result v5

    iget-object v6, v1, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v6}, Lcom/android/billingclient/api/f;->b()Z

    move-result v6

    iget-object v7, v1, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    invoke-static {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/play_billing/A;->c(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    move-object v12, v4

    :cond_0
    iget-boolean v5, v1, Lcom/android/billingclient/api/c;->l:Z

    if-nez v5, :cond_1

    const-string v0, "getPurchaseHistory is not supported on current device"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/v;

    sget-object v1, Lcom/android/billingclient/api/y;->q:Lcom/android/billingclient/api/e;

    invoke-direct {v0, v1, v4}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_1
    const/16 v5, 0xb

    :try_start_0
    iget-object v8, v1, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-object v6, v1, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/4 v9, 0x6

    move-object/from16 v11, p1

    move-object v13, v3

    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/J2;->o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v7, "getPurchaseHistory()"

    invoke-static {v6, v2, v7}, Lcom/android/billingclient/api/K;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/J;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/billingclient/api/J;->a()Lcom/android/billingclient/api/e;

    move-result-object v8

    sget-object v9, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    if-eq v8, v9, :cond_2

    invoke-virtual {v7}, Lcom/android/billingclient/api/J;->b()I

    move-result v0

    invoke-static {v0, v5, v8}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    new-instance v0, Lcom/android/billingclient/api/v;

    invoke-direct {v0, v8, v4}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_2
    const-string v7, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const-string v8, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v6, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v9, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v10, v12, :cond_4

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "Purchase record found for sku : "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v2, v14}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v14, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    invoke-direct {v14, v12, v13}, Lcom/android/billingclient/api/PurchaseHistoryRecord;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v14}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->e()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_3

    const-string v11, "BUG: empty/null token!"

    invoke-static {v2, v11}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    :cond_3
    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "Got an exception trying to decode the purchase!"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    const/16 v2, 0x33

    invoke-static {v2, v5, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    new-instance v1, Lcom/android/billingclient/api/v;

    invoke-direct {v1, v0, v4}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    :goto_1
    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v11, :cond_5

    const/16 v7, 0x1a

    sget-object v8, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    invoke-static {v7, v5, v8}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v5

    invoke-direct {v1, v5}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    :cond_5
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v6, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Continuation token: "

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v1, Lcom/android/billingclient/api/v;

    sget-object v2, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    invoke-direct {v1, v2, v0}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "Got exception trying to get purchase history, try to reconnect"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    const/16 v2, 0x3b

    invoke-static {v2, v5, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    new-instance v1, Lcom/android/billingclient/api/v;

    invoke-direct {v1, v0, v4}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto :goto_1

    :goto_2
    return-object v0
.end method

.method static bridge synthetic g0(Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    return-object p0
.end method

.method static bridge synthetic h0(Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic i0(Lcom/android/billingclient/api/c;)Lcom/google/android/gms/internal/play_billing/J2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    return-object p0
.end method

.method private l(Landroid/content/Context;LC0/i;Lcom/android/billingclient/api/f;LC0/u;Ljava/lang/String;Lcom/android/billingclient/api/x;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m2;->D()Lcom/google/android/gms/internal/play_billing/l2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/l2;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    .line 12
    .line 13
    .line 14
    iget-object p5, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/l2;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/l2;

    .line 21
    .line 22
    .line 23
    if-eqz p6, :cond_0

    .line 24
    .line 25
    :goto_0
    iput-object p6, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object p5, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/google/android/gms/internal/play_billing/m2;

    .line 35
    .line 36
    new-instance p6, Lcom/android/billingclient/api/z;

    .line 37
    .line 38
    invoke-direct {p6, p5, p1}, Lcom/android/billingclient/api/z;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/m2;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    if-nez p2, :cond_1

    .line 43
    .line 44
    const-string p1, "BillingClient"

    .line 45
    .line 46
    const-string p5, "Billing client should have a valid listener but the provided is null."

    .line 47
    .line 48
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance p1, Lcom/android/billingclient/api/M;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    iget-object v6, p0, Lcom/android/billingclient/api/c;->f:Lcom/android/billingclient/api/x;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    move-object v0, p1

    .line 60
    move-object v2, p2

    .line 61
    move-object v4, p4

    .line 62
    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/M;-><init>(Landroid/content/Context;LC0/i;LC0/A;LC0/u;LC0/l;Lcom/android/billingclient/api/x;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    .line 66
    .line 67
    iput-object p3, p0, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    .line 68
    .line 69
    if-eqz p4, :cond_2

    .line 70
    .line 71
    const/4 p1, 0x1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    const/4 p1, 0x0

    .line 74
    :goto_2
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->A:Z

    .line 75
    .line 76
    iget-object p1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->p:Z

    return-void
.end method

.method static bridge synthetic m0(Lcom/android/billingclient/api/c;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 6

    .line 1
    const-wide/16 v2, 0x7530

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->q:Z

    return-void
.end method

.method static bridge synthetic n0(Lcom/android/billingclient/api/c;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/billingclient/api/c;->a:I

    return-void
.end method

.method static bridge synthetic o(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->r:Z

    return-void
.end method

.method static bridge synthetic o0(Lcom/android/billingclient/api/c;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/billingclient/api/c;->k:I

    return-void
.end method

.method static bridge synthetic p(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->s:Z

    return-void
.end method

.method static bridge synthetic p0(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->o:Z

    return-void
.end method

.method static bridge synthetic q(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->t:Z

    return-void
.end method

.method static bridge synthetic r(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->u:Z

    return-void
.end method

.method static bridge synthetic s(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->v:Z

    return-void
.end method

.method static bridge synthetic t(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->w:Z

    return-void
.end method

.method static bridge synthetic u(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->x:Z

    return-void
.end method

.method static bridge synthetic v(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->y:Z

    return-void
.end method

.method static bridge synthetic w(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->l:Z

    return-void
.end method

.method static bridge synthetic x(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->m:Z

    return-void
.end method

.method static bridge synthetic y(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->n:Z

    return-void
.end method

.method static bridge synthetic z(Lcom/android/billingclient/api/c;Lcom/google/android/gms/internal/play_billing/J2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    return-void
.end method


# virtual methods
.method final synthetic D(LC0/b;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, LC0/b;->a(Lcom/android/billingclient/api/e;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method final synthetic E(Lcom/android/billingclient/api/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    invoke-virtual {v0}, Lcom/android/billingclient/api/M;->d()LC0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    invoke-virtual {v0}, Lcom/android/billingclient/api/M;->d()LC0/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, LC0/i;->onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    return-void

    :cond_0
    const-string p1, "BillingClient"

    const-string v0, "No valid listener is set in BroadcastManager"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic F(LC0/e;LC0/d;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, LC0/d;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p1, v0, p2}, LC0/e;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method final synthetic G(LC0/f;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0, v1}, LC0/f;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method final synthetic I(LC0/g;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, v0, v1}, LC0/g;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method final synthetic J(LC0/h;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j;->q()Lcom/google/android/gms/internal/play_billing/j;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p1, v0, v1}, LC0/h;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final a(LC0/a;LC0/b;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    :goto_0
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p1}, LC0/b;->a(Lcom/android/billingclient/api/e;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1}, LC0/a;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const-string p1, "BillingClient"

    .line 33
    .line 34
    const-string v0, "Please provide a valid purchase token."

    .line 35
    .line 36
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lcom/android/billingclient/api/y;->i:Lcom/android/billingclient/api/e;

    .line 40
    .line 41
    const/16 v0, 0x1a

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->n:Z

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    sget-object p1, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/e;

    .line 49
    .line 50
    const/16 v0, 0x1b

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v3, Lcom/android/billingclient/api/P;

    .line 54
    .line 55
    invoke-direct {v3, p0, p1, p2}, Lcom/android/billingclient/api/P;-><init>(Lcom/android/billingclient/api/c;LC0/a;LC0/b;)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Lcom/android/billingclient/api/Q;

    .line 59
    .line 60
    invoke-direct {v6, p0, p2}, Lcom/android/billingclient/api/Q;-><init>(Lcom/android/billingclient/api/c;LC0/b;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const-wide/16 v4, 0x7530

    .line 68
    .line 69
    move-object v2, p0

    .line 70
    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const/16 v0, 0x19

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    return-void
.end method

.method public final b(LC0/d;LC0/e;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    :goto_0
    invoke-static {v2, v1, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, LC0/d;->a()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p2, v0, p1}, LC0/e;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v3, Lcom/android/billingclient/api/j;

    .line 27
    .line 28
    invoke-direct {v3, p0, p1, p2}, Lcom/android/billingclient/api/j;-><init>(Lcom/android/billingclient/api/c;LC0/d;LC0/e;)V

    .line 29
    .line 30
    .line 31
    new-instance v6, Lcom/android/billingclient/api/k;

    .line 32
    .line 33
    invoke-direct {v6, p0, p2, p1}, Lcom/android/billingclient/api/k;-><init>(Lcom/android/billingclient/api/c;LC0/e;LC0/d;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const-wide/16 v4, 0x7530

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v2, 0x19

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method final synthetic b0(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-object p4, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/J2;->N(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 5

    .line 1
    const-string v0, "BillingClient"

    const/16 v1, 0xc

    invoke-static {v1}, Lcom/android/billingclient/api/w;->c(I)Lcom/google/android/gms/internal/play_billing/W1;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->V(Lcom/google/android/gms/internal/play_billing/W1;)V

    const/4 v1, 0x3

    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    invoke-virtual {v2}, Lcom/android/billingclient/api/M;->f()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    invoke-virtual {v2}, Lcom/android/billingclient/api/u;->c()V

    :cond_1
    iget-object v2, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    if-eqz v2, :cond_2

    const-string v2, "Unbinding from service."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    iget-object v4, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    invoke-virtual {v2, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iput-object v3, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    :cond_2
    iput-object v3, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-object v2, p0, Lcom/android/billingclient/api/c;->B:Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iput-object v3, p0, Lcom/android/billingclient/api/c;->B:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_1
    const-string v3, "There was an exception while ending connection!"

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_2
    iput v1, p0, Lcom/android/billingclient/api/c;->a:I

    return-void

    :goto_3
    iput v1, p0, Lcom/android/billingclient/api/c;->a:I

    throw v0
.end method

.method final synthetic c0(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    iget-object v1, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v1, 0x3

    move-object v3, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/J2;->A(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lcom/android/billingclient/api/e;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x5

    if-nez v0, :cond_1

    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1, v2, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lcom/android/billingclient/api/w;->c(I)Lcom/google/android/gms/internal/play_billing/W1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->V(Lcom/google/android/gms/internal/play_billing/W1;)V

    :goto_0
    return-object p1

    :cond_1
    sget-object v0, Lcom/android/billingclient/api/y;->a:Lcom/android/billingclient/api/e;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x6

    const/4 v7, 0x7

    const/16 v8, 0x8

    const/16 v9, 0xb

    const/16 v10, 0xc

    const/16 v11, 0xd

    const/16 v12, 0x9

    const/16 v13, 0xa

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "subscriptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "priceChangeConfirmation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "kkk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v11

    goto/16 :goto_2

    :sswitch_3
    const-string v0, "jjj"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v10

    goto/16 :goto_2

    :sswitch_4
    const-string v0, "iii"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v9

    goto/16 :goto_2

    :sswitch_5
    const-string v0, "hhh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v13

    goto :goto_2

    :sswitch_6
    const-string v0, "ggg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v12

    goto :goto_2

    :sswitch_7
    const-string v0, "fff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v8

    goto :goto_2

    :sswitch_8
    const-string v0, "eee"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v7

    goto :goto_2

    :sswitch_9
    const-string v0, "ddd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :sswitch_a
    const-string v0, "ccc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v6

    goto :goto_2

    :sswitch_b
    const-string v0, "bbb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v5

    goto :goto_2

    :sswitch_c
    const-string v0, "aaa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v4

    goto :goto_2

    :sswitch_d
    const-string v0, "subscriptionsUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, -0x1

    :goto_2
    packed-switch v0, :pswitch_data_0

    const-string v0, "BillingClient"

    const-string v1, "Unsupported feature: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/y;->z:Lcom/android/billingclient/api/e;

    const/16 v0, 0x22

    invoke-direct {p0, p1, v0, v3}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_0
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->y:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/android/billingclient/api/y;->y:Lcom/android/billingclient/api/e;

    :goto_3
    const/16 v0, 0x67

    const/16 v1, 0x12

    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_1
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->x:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_4

    :cond_4
    sget-object p1, Lcom/android/billingclient/api/y;->E:Lcom/android/billingclient/api/e;

    :goto_4
    const/16 v0, 0x42

    const/16 v1, 0xe

    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_2
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->w:Z

    if-eqz p1, :cond_5

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_5

    :cond_5
    sget-object p1, Lcom/android/billingclient/api/y;->D:Lcom/android/billingclient/api/e;

    :goto_5
    const/16 v0, 0x3c

    invoke-direct {p0, p1, v0, v11}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_3
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->u:Z

    if-eqz p1, :cond_6

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_6

    :cond_6
    sget-object p1, Lcom/android/billingclient/api/y;->B:Lcom/android/billingclient/api/e;

    :goto_6
    const/16 v0, 0x21

    invoke-direct {p0, p1, v0, v10}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_4
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->u:Z

    if-eqz p1, :cond_7

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_7

    :cond_7
    sget-object p1, Lcom/android/billingclient/api/y;->A:Lcom/android/billingclient/api/e;

    :goto_7
    const/16 v0, 0x20

    invoke-direct {p0, p1, v0, v9}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_5
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->t:Z

    if-eqz p1, :cond_8

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_8

    :cond_8
    sget-object p1, Lcom/android/billingclient/api/y;->v:Lcom/android/billingclient/api/e;

    :goto_8
    const/16 v0, 0x14

    invoke-direct {p0, p1, v0, v13}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_6
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->s:Z

    if-eqz p1, :cond_9

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_9

    :cond_9
    sget-object p1, Lcom/android/billingclient/api/y;->t:Lcom/android/billingclient/api/e;

    :goto_9
    const/16 v0, 0x3d

    invoke-direct {p0, p1, v0, v12}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_7
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->s:Z

    if-eqz p1, :cond_a

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_a

    :cond_a
    sget-object p1, Lcom/android/billingclient/api/y;->t:Lcom/android/billingclient/api/e;

    :goto_a
    const/16 v0, 0x13

    invoke-direct {p0, p1, v0, v8}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_8
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->q:Z

    if-eqz p1, :cond_b

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_b

    :cond_b
    sget-object p1, Lcom/android/billingclient/api/y;->u:Lcom/android/billingclient/api/e;

    :goto_b
    const/16 v0, 0x15

    invoke-direct {p0, p1, v0, v7}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_9
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->r:Z

    if-eqz p1, :cond_c

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_c

    :cond_c
    sget-object p1, Lcom/android/billingclient/api/y;->s:Lcom/android/billingclient/api/e;

    :goto_c
    const/16 v0, 0x1f

    invoke-direct {p0, p1, v0, v6}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_a
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->p:Z

    if-eqz p1, :cond_d

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_d

    :cond_d
    sget-object p1, Lcom/android/billingclient/api/y;->w:Lcom/android/billingclient/api/e;

    :goto_d
    const/16 v0, 0x1e

    invoke-direct {p0, p1, v0, v2}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_b
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->m:Z

    if-eqz p1, :cond_e

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_e

    :cond_e
    sget-object p1, Lcom/android/billingclient/api/y;->r:Lcom/android/billingclient/api/e;

    :goto_e
    const/16 v0, 0x23

    invoke-direct {p0, p1, v0, v4}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_c
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->j:Z

    if-eqz p1, :cond_f

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_f

    :cond_f
    sget-object p1, Lcom/android/billingclient/api/y;->p:Lcom/android/billingclient/api/e;

    :goto_f
    invoke-direct {p0, p1, v13, v5}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :pswitch_d
    iget-boolean p1, p0, Lcom/android/billingclient/api/c;->i:Z

    if-eqz p1, :cond_10

    sget-object p1, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    goto :goto_10

    :cond_10
    sget-object p1, Lcom/android/billingclient/api/y;->o:Lcom/android/billingclient/api/e;

    :goto_10
    invoke-direct {p0, p1, v12, v1}, Lcom/android/billingclient/api/c;->Z(Lcom/android/billingclient/api/e;II)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_d
        0x17841 -> :sswitch_c
        0x17c22 -> :sswitch_b
        0x18003 -> :sswitch_a
        0x183e4 -> :sswitch_9
        0x187c5 -> :sswitch_8
        0x18ba6 -> :sswitch_7
        0x18f87 -> :sswitch_6
        0x19368 -> :sswitch_5
        0x19749 -> :sswitch_4
        0x19b2a -> :sswitch_3
        0x19f0b -> :sswitch_2
        0xc5ff92e -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/billingclient/api/c;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Landroid/app/Activity;Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/e;
    .locals 24

    .line 1
    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v9, "BUY_INTENT"

    const-string v1, "proxyPackageVersion"

    iget-object v2, v8, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    const/4 v10, 0x2

    if-eqz v2, :cond_2e

    iget-object v2, v8, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/M;

    invoke-virtual {v2}, Lcom/android/billingclient/api/M;->d()LC0/i;

    move-result-object v2

    if-eqz v2, :cond_2e

    invoke-virtual/range {p0 .. p0}, Lcom/android/billingclient/api/c;->e()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    invoke-static {v10, v10, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->g()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->h()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/o;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/o;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v6

    invoke-virtual {v6}, Lcom/android/billingclient/api/g;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v7

    const-string v11, "subs"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/16 v12, 0x9

    const-string v13, "BillingClient"

    if-eqz v11, :cond_2

    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->i:Z

    if-eqz v11, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Current client doesn\'t support subscriptions."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/y;->o:Lcom/android/billingclient/api/e;

    invoke-static {v12, v10, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_2
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->q()Z

    move-result v11

    if-eqz v11, :cond_4

    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->l:Z

    if-eqz v11, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/y;->h:Lcom/android/billingclient/api/e;

    const/16 v1, 0x12

    invoke-static {v1, v10, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v14, 0x1

    if-le v11, v14, :cond_6

    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->s:Z

    if-eqz v11, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "Current client doesn\'t support multi-item purchases."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/y;->t:Lcom/android/billingclient/api/e;

    const/16 v1, 0x13

    invoke-static {v1, v10, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_8

    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->t:Z

    if-eqz v11, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/y;->v:Lcom/android/billingclient/api/e;

    const/16 v1, 0x14

    invoke-static {v1, v10, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_8
    :goto_3
    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->l:Z

    if-eqz v11, :cond_2a

    iget-boolean v11, v8, Lcom/android/billingclient/api/c;->n:Z

    iget-boolean v15, v8, Lcom/android/billingclient/api/c;->v:Z

    iget-object v12, v8, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v12}, Lcom/android/billingclient/api/f;->a()Z

    move-result v12

    iget-object v10, v8, Lcom/android/billingclient/api/c;->z:Lcom/android/billingclient/api/f;

    invoke-virtual {v10}, Lcom/android/billingclient/api/f;->b()Z

    move-result v10

    iget-boolean v4, v8, Lcom/android/billingclient/api/c;->A:Z

    iget-object v14, v8, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    move-object/from16 v17, v9

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v0, "playBillingLibraryVersion"

    invoke-virtual {v9, v0, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->b()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->b()I

    move-result v0

    const-string v14, "prorationMode"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_9
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->c()Ljava/lang/String;

    move-result-object v0

    const-string v14, "accountId"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->d()Ljava/lang/String;

    move-result-object v0

    const-string v14, "obfuscatedProfileId"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->p()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "isOfferPersonalizedByDeveloper"

    const/4 v14, 0x1

    invoke-virtual {v9, v0, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_c
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_d

    new-instance v14, Ljava/util/ArrayList;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v0, "skusToReplace"

    invoke-virtual {v9, v0, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->e()Ljava/lang/String;

    move-result-object v0

    const-string v14, "oldSkuPurchaseToken"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_f

    const-string v14, "oldSkuPurchaseId"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->f()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_10

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/d;->f()Ljava/lang/String;

    move-result-object v14

    const-string v0, "originalExternalTransactionId"

    invoke-virtual {v9, v0, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_11

    const-string v14, "paymentsPurchaseParams"

    invoke-virtual {v9, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    if-eqz v11, :cond_12

    if-eqz v12, :cond_12

    const-string v0, "enablePendingPurchases"

    const/4 v11, 0x1

    invoke-virtual {v9, v0, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_4

    :cond_12
    const/4 v11, 0x1

    :goto_4
    if-eqz v15, :cond_13

    if-eqz v10, :cond_13

    const-string v0, "enablePendingPurchaseForSubscriptions"

    invoke-virtual {v9, v0, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_13
    if-eqz v4, :cond_14

    const-string v0, "enableAlternativeBilling"

    invoke-virtual {v9, v0, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v4, "SKU_OFFER_ID_TOKEN_LIST"

    const-string v10, "additionalSkuTypes"

    const-string v11, "additionalSkus"

    const-string v12, "skuDetailsTokens"

    if-nez v0, :cond_19

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-nez v18, :cond_18

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_15

    invoke-virtual {v9, v12, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_15
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v12, 0x1

    if-le v0, v12, :cond_16

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    invoke-direct {v0, v15}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v16

    add-int/lit8 v14, v16, -0x1

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v14

    if-lt v12, v14, :cond_17

    invoke-virtual {v9, v11, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v9, v10, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_16
    move-object/from16 v21, v1

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move-object/from16 v23, v13

    goto/16 :goto_7

    :cond_17
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_18
    const/4 v0, 0x0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v0

    :cond_19
    const/4 v0, 0x1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v14

    add-int/lit8 v14, v14, -0x1

    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v21, v1

    move-object/from16 v20, v6

    const/4 v6, 0x0

    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v6, v1, :cond_1d

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v1}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lcom/android/billingclient/api/g;->i()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->isEmpty()Z

    move-result v23

    if-nez v23, :cond_1a

    move-object/from16 v23, v13

    invoke-virtual/range {v22 .. v22}, Lcom/android/billingclient/api/g;->i()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_1a
    move-object/from16 v23, v13

    :goto_6
    invoke-virtual {v1}, Lcom/android/billingclient/api/d$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v22 .. v22}, Lcom/android/billingclient/api/g;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1b

    invoke-virtual/range {v22 .. v22}, Lcom/android/billingclient/api/g;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    if-lez v6, :cond_1c

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v1}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v1}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v13, v23

    goto :goto_5

    :cond_1d
    move-object/from16 v23, v13

    invoke-virtual {v9, v4, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual {v9, v12, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1e
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    invoke-virtual {v9, v0, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {v9, v11, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v9, v10, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_20
    :goto_7
    invoke-virtual {v9, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-boolean v0, v8, Lcom/android/billingclient/api/c;->q:Z

    if-eqz v0, :cond_21

    goto :goto_8

    :cond_21
    sget-object v0, Lcom/android/billingclient/api/y;->u:Lcom/android/billingclient/api/e;

    const/16 v1, 0x15

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_22
    :goto_8
    if-eqz v5, :cond_23

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_23

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "skuPackageName"

    invoke-virtual {v9, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v14, 0x1

    goto :goto_9

    :cond_23
    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_24

    const-string v1, "accountName"

    invoke-virtual {v9, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_24
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_25

    const-string v0, "Activity\'s intent is null."

    move-object/from16 v10, v23

    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :cond_25
    move-object/from16 v10, v23

    const-string v1, "PROXY_PACKAGE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_26

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "proxyPackage"

    invoke-virtual {v9, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v8, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, v21

    :try_start_1
    invoke-virtual {v9, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_a

    :catch_0
    move-object/from16 v1, v21

    :catch_1
    const-string v0, "package not found"

    invoke-virtual {v9, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_26
    :goto_a
    iget-boolean v0, v8, Lcom/android/billingclient/api/c;->t:Z

    if-eqz v0, :cond_27

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    const/16 v0, 0x11

    :goto_b
    move v3, v0

    goto :goto_c

    :cond_27
    iget-boolean v0, v8, Lcom/android/billingclient/api/c;->r:Z

    if-eqz v0, :cond_28

    if-eqz v14, :cond_28

    const/16 v0, 0xf

    goto :goto_b

    :cond_28
    iget-boolean v0, v8, Lcom/android/billingclient/api/c;->n:Z

    if-eqz v0, :cond_29

    const/16 v3, 0x9

    goto :goto_c

    :cond_29
    const/4 v0, 0x6

    goto :goto_b

    :goto_c
    new-instance v0, Lcom/android/billingclient/api/o;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v4, v20

    move-object/from16 v5, v19

    move-object/from16 v6, p2

    move-object v7, v9

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/o;-><init>(Lcom/android/billingclient/api/c;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)V

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    const-wide/16 v3, 0x1388

    move-object/from16 v1, p0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/16 v1, 0x4e

    goto :goto_d

    :cond_2a
    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move-object/from16 v17, v9

    move-object v10, v13

    new-instance v2, Lcom/android/billingclient/api/O;

    move-object/from16 v1, v19

    move-object/from16 v0, v20

    invoke-direct {v2, v8, v0, v1}, Lcom/android/billingclient/api/O;-><init>(Lcom/android/billingclient/api/c;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/c;->c:Landroid/os/Handler;

    const-wide/16 v3, 0x1388

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/16 v1, 0x50

    :goto_d
    if-nez v0, :cond_2b

    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    const/16 v1, 0x19

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_e

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    goto :goto_f

    :cond_2b
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1388

    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/play_billing/A;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/play_billing/A;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_2d

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to buy item, Error response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v4}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    move-result-object v2

    if-eqz v0, :cond_2c

    const/16 v1, 0x17

    :cond_2c
    const/4 v3, 0x2

    invoke-static {v1, v3, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v2}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v2

    :cond_2d
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/android/billingclient/api/ProxyBillingActivity;

    move-object/from16 v3, p1

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v2, v17

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    sget-object v0, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    return-object v0

    :goto_e
    const-string v1, "Exception while launching billing flow. Try to reconnect"

    invoke-static {v10, v1, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    const/4 v1, 0x5

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :goto_f
    const-string v1, "Time out while launching billing flow. Try to reconnect"

    invoke-static {v10, v1, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/y;->n:Lcom/android/billingclient/api/e;

    const/4 v1, 0x4

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/c;->P(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/e;

    return-object v0

    :cond_2e
    move v2, v10

    sget-object v0, Lcom/android/billingclient/api/y;->F:Lcom/android/billingclient/api/e;

    const/16 v1, 0xc

    invoke-static {v1, v2, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    return-object v0
.end method

.method public final h(Lcom/android/billingclient/api/h;LC0/f;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p2, p1, v0}, LC0/f;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->t:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string p1, "BillingClient"

    .line 32
    .line 33
    const-string v0, "Querying product details is not supported."

    .line 34
    .line 35
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lcom/android/billingclient/api/y;->v:Lcom/android/billingclient/api/e;

    .line 39
    .line 40
    const/16 v0, 0x14

    .line 41
    .line 42
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v3, Lcom/android/billingclient/api/m;

    .line 56
    .line 57
    invoke-direct {v3, p0, p1, p2}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/h;LC0/f;)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Lcom/android/billingclient/api/n;

    .line 61
    .line 62
    invoke-direct {v6, p0, p2}, Lcom/android/billingclient/api/n;-><init>(Lcom/android/billingclient/api/c;LC0/f;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->O()Landroid/os/Handler;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const-wide/16 v4, 0x7530

    .line 70
    .line 71
    move-object v2, p0

    .line 72
    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/c;->T(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-nez p1, :cond_2

    .line 77
    .line 78
    invoke-direct {p0}, Lcom/android/billingclient/api/c;->Q()Lcom/android/billingclient/api/e;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const/16 v0, 0x19

    .line 83
    .line 84
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    return-void
.end method

.method public final i(LC0/j;LC0/g;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, LC0/j;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/c;->W(Ljava/lang/String;LC0/g;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j(LC0/k;LC0/h;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, LC0/k;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/c;->X(Ljava/lang/String;LC0/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method final synthetic j0(LC0/a;LC0/b;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {p1}, LC0/a;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v4, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v5, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v6, "playBillingLibraryVersion"

    .line 24
    .line 25
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 v4, 0x9

    .line 29
    .line 30
    invoke-interface {v2, v4, v3, p1, v5}, Lcom/google/android/gms/internal/play_billing/J2;->f0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/A;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {v2, p1}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    invoke-interface {p2, p1}, LC0/b;->a(Lcom/android/billingclient/api/e;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :catch_0
    move-exception p1

    .line 51
    const-string v2, "Error acknowledge purchase!"

    .line 52
    .line 53
    invoke-static {v0, v2, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 57
    .line 58
    const/16 v0, 0x1c

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    invoke-static {v0, v2, p1}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0
.end method

.method public final k(LC0/c;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    const-string v2, "BillingClient"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Service connection is valid. No need to re-initialize."

    .line 11
    .line 12
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/android/billingclient/api/w;->c(I)Lcom/google/android/gms/internal/play_billing/W1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/c;->V(Lcom/google/android/gms/internal/play_billing/W1;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/android/billingclient/api/y;->l:Lcom/android/billingclient/api/e;

    .line 23
    .line 24
    invoke-interface {p1, v0}, LC0/c;->a(Lcom/android/billingclient/api/e;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget v0, p0, Lcom/android/billingclient/api/c;->a:I

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    if-ne v0, v3, :cond_1

    .line 32
    .line 33
    const-string v0, "Client is already in the process of connecting to billing service."

    .line 34
    .line 35
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lcom/android/billingclient/api/y;->d:Lcom/android/billingclient/api/e;

    .line 39
    .line 40
    const/16 v2, 0x25

    .line 41
    .line 42
    invoke-static {v2, v1, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0}, LC0/c;->a(Lcom/android/billingclient/api/e;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget v0, p0, Lcom/android/billingclient/api/c;->a:I

    .line 54
    .line 55
    const/4 v4, 0x3

    .line 56
    if-ne v0, v4, :cond_2

    .line 57
    .line 58
    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    .line 59
    .line 60
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 64
    .line 65
    const/16 v2, 0x26

    .line 66
    .line 67
    invoke-static {v2, v1, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, v0}, LC0/c;->a(Lcom/android/billingclient/api/e;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    iput v3, p0, Lcom/android/billingclient/api/c;->a:I

    .line 79
    .line 80
    const-string v0, "Starting in-app billing setup."

    .line 81
    .line 82
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/android/billingclient/api/u;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-direct {v0, p0, p1, v4}, Lcom/android/billingclient/api/u;-><init>(Lcom/android/billingclient/api/c;LC0/c;LC0/o;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    .line 92
    .line 93
    new-instance v0, Landroid/content/Intent;

    .line 94
    .line 95
    const-string v4, "com.android.vending.billing.InAppBillingService.BIND"

    .line 96
    .line 97
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v4, "com.android.vending"

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    iget-object v5, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const/4 v6, 0x0

    .line 112
    invoke-virtual {v5, v0, v6}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const/16 v7, 0x29

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-nez v8, :cond_5

    .line 125
    .line 126
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 131
    .line 132
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 133
    .line 134
    if-eqz v5, :cond_6

    .line 135
    .line 136
    iget-object v7, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_4

    .line 145
    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    new-instance v4, Landroid/content/ComponentName;

    .line 149
    .line 150
    invoke-direct {v4, v7, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance v5, Landroid/content/Intent;

    .line 154
    .line 155
    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    .line 162
    .line 163
    const-string v4, "playBillingLibraryVersion"

    .line 164
    .line 165
    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 169
    .line 170
    iget-object v4, p0, Lcom/android/billingclient/api/c;->h:Lcom/android/billingclient/api/u;

    .line 171
    .line 172
    invoke-virtual {v0, v5, v4, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_3

    .line 177
    .line 178
    const-string p1, "Service was bonded successfully."

    .line 179
    .line 180
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    .line 185
    .line 186
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const/16 v3, 0x27

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    .line 193
    .line 194
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    const/16 v3, 0x28

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_5
    move v3, v7

    .line 201
    :cond_6
    :goto_0
    iput v6, p0, Lcom/android/billingclient/api/c;->a:I

    .line 202
    .line 203
    const-string v0, "Billing service unavailable on device."

    .line 204
    .line 205
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    sget-object v0, Lcom/android/billingclient/api/y;->c:Lcom/android/billingclient/api/e;

    .line 209
    .line 210
    invoke-static {v3, v1, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, v0}, LC0/c;->a(Lcom/android/billingclient/api/e;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method final synthetic k0(LC0/d;LC0/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/d;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x4

    .line 8
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v3, "Consuming purchase with token: "

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/android/billingclient/api/c;->n:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-boolean v4, p0, Lcom/android/billingclient/api/c;->n:Z

    .line 41
    .line 42
    iget-object v5, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v6, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 47
    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    const-string v4, "playBillingLibraryVersion"

    .line 52
    .line 53
    invoke-virtual {v6, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v2

    .line 58
    goto :goto_3

    .line 59
    :cond_0
    :goto_0
    const/16 v4, 0x9

    .line 60
    .line 61
    invoke-interface {v2, v4, v3, p1, v6}, Lcom/google/android/gms/internal/play_billing/J2;->i(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "RESPONSE_CODE"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v2, p0, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    .line 77
    .line 78
    iget-object v3, p0, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const/4 v4, 0x3

    .line 85
    invoke-interface {v2, v4, v3, p1}, Lcom/google/android/gms/internal/play_billing/J2;->h(ILjava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const-string v2, ""

    .line 90
    .line 91
    :goto_1
    invoke-static {v3, v2}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-nez v3, :cond_2

    .line 96
    .line 97
    const-string v3, "Successfully consumed purchase."

    .line 98
    .line 99
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-interface {p2, v2, p1}, LC0/e;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v5, "Error consuming purchase with token. Response code: "

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/16 v3, 0x17

    .line 127
    .line 128
    invoke-static {v3, v1, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-direct {p0, v3}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :goto_3
    const-string v3, "Error consuming purchase!"

    .line 137
    .line 138
    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lcom/android/billingclient/api/y;->m:Lcom/android/billingclient/api/e;

    .line 142
    .line 143
    const/16 v2, 0x1d

    .line 144
    .line 145
    invoke-static {v2, v1, v0}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p2, v0, p1}, LC0/e;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :goto_4
    const/4 p1, 0x0

    .line 156
    return-object p1
.end method

.method final synthetic l0(Lcom/android/billingclient/api/h;LC0/f;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "BillingClient"

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/h;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/h;->b()Lcom/google/android/gms/internal/play_billing/j;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    const/4 v4, 0x0

    .line 23
    :goto_0
    if-ge v4, v11, :cond_e

    .line 24
    .line 25
    add-int/lit8 v14, v4, 0x14

    .line 26
    .line 27
    if-le v14, v11, :cond_0

    .line 28
    .line 29
    move v5, v11

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v5, v14

    .line 32
    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-interface {v10, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const/4 v7, 0x0

    .line 51
    :goto_2
    if-ge v7, v5, :cond_1

    .line 52
    .line 53
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lcom/android/billingclient/api/h$b;

    .line 58
    .line 59
    invoke-virtual {v8}, Lcom/android/billingclient/api/h$b;->b()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    new-instance v8, Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v5, "ITEM_ID_LIST"

    .line 75
    .line 76
    invoke-virtual {v8, v5, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v1, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    .line 80
    .line 81
    const-string v5, "playBillingLibraryVersion"

    .line 82
    .line 83
    invoke-virtual {v8, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    iget-object v4, v1, Lcom/android/billingclient/api/c;->g:Lcom/google/android/gms/internal/play_billing/J2;

    .line 87
    .line 88
    iget-boolean v7, v1, Lcom/android/billingclient/api/c;->w:Z

    .line 89
    .line 90
    const/4 v9, 0x1

    .line 91
    if-eq v9, v7, :cond_2

    .line 92
    .line 93
    const/16 v7, 0x11

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_2
    const/16 v7, 0x14

    .line 97
    .line 98
    :goto_3
    iget-object v12, v1, Lcom/android/billingclient/api/c;->e:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/c;->Y()Z

    .line 105
    .line 106
    .line 107
    move-result v16

    .line 108
    iget-object v15, v1, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/c;->R(Lcom/android/billingclient/api/h;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/c;->R(Lcom/android/billingclient/api/h;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-direct/range {p0 .. p1}, Lcom/android/billingclient/api/c;->R(Lcom/android/billingclient/api/h;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    new-instance v13, Landroid/os/Bundle;

    .line 120
    .line 121
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v13, v5, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string v5, "enablePendingPurchases"

    .line 128
    .line 129
    invoke-virtual {v13, v5, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    const-string v5, "SKU_DETAILS_RESPONSE_FORMAT"

    .line 133
    .line 134
    const-string v15, "PRODUCT_DETAILS"

    .line 135
    .line 136
    invoke-virtual {v13, v5, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    if-eqz v16, :cond_3

    .line 140
    .line 141
    const-string v5, "enablePendingPurchaseForSubscriptions"

    .line 142
    .line 143
    invoke-virtual {v13, v5, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :catch_0
    move-exception v0

    .line 148
    const/4 v4, 0x6

    .line 149
    const/4 v10, 0x7

    .line 150
    goto/16 :goto_9

    .line 151
    .line 152
    :cond_3
    :goto_4
    new-instance v5, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v15, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    move-object/from16 v17, v10

    .line 167
    .line 168
    const/4 v10, 0x0

    .line 169
    const/16 v18, 0x0

    .line 170
    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    :goto_5
    if-ge v10, v9, :cond_5

    .line 174
    .line 175
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v20

    .line 179
    check-cast v20, Lcom/android/billingclient/api/h$b;

    .line 180
    .line 181
    move-object/from16 v21, v6

    .line 182
    .line 183
    const/4 v6, 0x0

    .line 184
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v22

    .line 191
    const/4 v6, 0x1

    .line 192
    xor-int/lit8 v16, v22, 0x1

    .line 193
    .line 194
    or-int v18, v18, v16

    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Lcom/android/billingclient/api/h$b;->c()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    move/from16 v20, v9

    .line 201
    .line 202
    const-string v9, "first_party"

    .line 203
    .line 204
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_4

    .line 209
    .line 210
    const-string v6, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products."

    .line 211
    .line 212
    const/4 v9, 0x0

    .line 213
    invoke-static {v9, v6}, Lcom/google/android/gms/internal/play_billing/b;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    const/16 v19, 0x1

    .line 220
    .line 221
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 222
    .line 223
    move/from16 v9, v20

    .line 224
    .line 225
    move-object/from16 v6, v21

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_5
    if-eqz v18, :cond_6

    .line 229
    .line 230
    const-string v6, "SKU_OFFER_ID_TOKEN_LIST"

    .line 231
    .line 232
    invoke-virtual {v13, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 233
    .line 234
    .line 235
    :cond_6
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-nez v5, :cond_7

    .line 240
    .line 241
    const-string v5, "SKU_SERIALIZED_DOCID_LIST"

    .line 242
    .line 243
    invoke-virtual {v13, v5, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 244
    .line 245
    .line 246
    :cond_7
    if-eqz v19, :cond_8

    .line 247
    .line 248
    const/4 v5, 0x0

    .line 249
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-nez v6, :cond_8

    .line 254
    .line 255
    const-string v6, "accountName"

    .line 256
    .line 257
    invoke-virtual {v13, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    .line 259
    .line 260
    :cond_8
    move v5, v7

    .line 261
    move-object v6, v12

    .line 262
    move-object v7, v0

    .line 263
    const/4 v10, 0x7

    .line 264
    move-object v9, v13

    .line 265
    :try_start_1
    invoke-interface/range {v4 .. v9}, Lcom/google/android/gms/internal/play_billing/J2;->f(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 266
    .line 267
    .line 268
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 269
    const/4 v5, 0x4

    .line 270
    const-string v6, "Item is unavailable for purchase."

    .line 271
    .line 272
    if-nez v4, :cond_9

    .line 273
    .line 274
    const-string v0, "queryProductDetailsAsync got empty product details response."

    .line 275
    .line 276
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const/16 v0, 0x2c

    .line 280
    .line 281
    :goto_6
    sget-object v2, Lcom/android/billingclient/api/y;->C:Lcom/android/billingclient/api/e;

    .line 282
    .line 283
    invoke-static {v0, v10, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 288
    .line 289
    .line 290
    move v12, v5

    .line 291
    goto/16 :goto_a

    .line 292
    .line 293
    :cond_9
    const-string v7, "DETAILS_LIST"

    .line 294
    .line 295
    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-nez v8, :cond_b

    .line 300
    .line 301
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/A;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/A;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    if-eqz v12, :cond_a

    .line 310
    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const-string v4, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    .line 317
    .line 318
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const/16 v0, 0x17

    .line 332
    .line 333
    invoke-static {v12, v6}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-static {v0, v10, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_a

    .line 345
    .line 346
    :cond_a
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 347
    .line 348
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    const/16 v0, 0x2d

    .line 352
    .line 353
    const/4 v2, 0x6

    .line 354
    invoke-static {v2, v6}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-static {v0, v10, v4}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 363
    .line 364
    .line 365
    const/4 v12, 0x6

    .line 366
    goto :goto_a

    .line 367
    :cond_b
    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    if-nez v4, :cond_c

    .line 372
    .line 373
    const-string v0, "queryProductDetailsAsync got null response list"

    .line 374
    .line 375
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    const/16 v0, 0x2e

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_c
    const/4 v5, 0x0

    .line 382
    :goto_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    if-ge v5, v6, :cond_d

    .line 387
    .line 388
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    check-cast v6, Ljava/lang/String;

    .line 393
    .line 394
    :try_start_2
    new-instance v7, Lcom/android/billingclient/api/g;

    .line 395
    .line 396
    invoke-direct {v7, v6}, Lcom/android/billingclient/api/g;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 397
    .line 398
    .line 399
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    const-string v8, "Got product details: "

    .line 404
    .line 405
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    invoke-static {v2, v6}, Lcom/google/android/gms/internal/play_billing/A;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    add-int/lit8 v5, v5, 0x1

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :catch_1
    move-exception v0

    .line 419
    const-string v4, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 420
    .line 421
    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    const/16 v0, 0x2f

    .line 425
    .line 426
    const-string v6, "Error trying to decode SkuDetails."

    .line 427
    .line 428
    const/4 v4, 0x6

    .line 429
    invoke-static {v4, v6}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-static {v0, v10, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 438
    .line 439
    .line 440
    :goto_8
    move v12, v4

    .line 441
    goto :goto_a

    .line 442
    :cond_d
    move v4, v14

    .line 443
    move-object/from16 v10, v17

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :catch_2
    move-exception v0

    .line 448
    const/4 v4, 0x6

    .line 449
    :goto_9
    const-string v5, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 450
    .line 451
    invoke-static {v2, v5, v0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 452
    .line 453
    .line 454
    const/16 v0, 0x2b

    .line 455
    .line 456
    sget-object v2, Lcom/android/billingclient/api/y;->j:Lcom/android/billingclient/api/e;

    .line 457
    .line 458
    invoke-static {v0, v10, v2}, Lcom/android/billingclient/api/w;->a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-direct {v1, v0}, Lcom/android/billingclient/api/c;->U(Lcom/google/android/gms/internal/play_billing/S1;)V

    .line 463
    .line 464
    .line 465
    const-string v6, "An internal error occurred."

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_e
    const-string v6, ""

    .line 469
    .line 470
    const/4 v12, 0x0

    .line 471
    :goto_a
    invoke-static {v12, v6}, Lcom/android/billingclient/api/y;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    move-object/from16 v2, p2

    .line 476
    .line 477
    invoke-interface {v2, v0, v3}, LC0/f;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    .line 478
    .line 479
    .line 480
    const/4 v2, 0x0

    .line 481
    return-object v2
.end method
