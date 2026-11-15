.class public Lcom/android/billingclient/api/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;

.field private d:Ljava/util/ArrayList;

.field private e:Z

.field private f:Lcom/android/billingclient/api/d$c$a;


# direct methods
.method synthetic constructor <init>(LC0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/android/billingclient/api/d$c;->a()Lcom/android/billingclient/api/d$c$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Lcom/android/billingclient/api/d$c$a;->e(Lcom/android/billingclient/api/d$c$a;)Lcom/android/billingclient/api/d$c$a;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->f:Lcom/android/billingclient/api/d$c$a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/d;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-nez v0, :cond_3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Details of the products must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Set SkuDetails or ProductDetailsParams, not both."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    const/4 v4, 0x0

    if-eqz v0, :cond_8

    iget-object v5, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-gt v5, v1, :cond_6

    goto/16 :goto_7

    :cond_6
    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SKU cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v5, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/d$b;

    move v6, v2

    :goto_4
    iget-object v7, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const-string v8, "play_pass_subs"

    if-ge v6, v7, :cond_c

    iget-object v7, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/android/billingclient/api/d$b;

    if-eqz v7, :cond_b

    if-eqz v6, :cond_a

    invoke-virtual {v7}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    invoke-virtual {v7}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All products should have same ProductType."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ProductDetailsParams cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v6

    invoke-virtual {v6}, Lcom/android/billingclient/api/g;->h()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_d
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/g;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_6

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All products must have the same package name."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_7
    new-instance v5, Lcom/android/billingclient/api/d;

    invoke-direct {v5, v4}, Lcom/android/billingclient/api/d;-><init>(LC0/v;)V

    if-nez v0, :cond_13

    if-eqz v3, :cond_10

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/d$b;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_8

    :cond_10
    move v1, v2

    :goto_8
    invoke-static {v5, v1}, Lcom/android/billingclient/api/d;->i(Lcom/android/billingclient/api/d;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/String;

    invoke-static {v5, v0}, Lcom/android/billingclient/api/d;->k(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->b:Ljava/lang/String;

    invoke-static {v5, v0}, Lcom/android/billingclient/api/d;->l(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->f:Lcom/android/billingclient/api/d$c$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c$a;->a()Lcom/android/billingclient/api/d$c;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/android/billingclient/api/d;->o(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/d$c;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    if-eqz v0, :cond_11

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_9

    :cond_11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_9
    invoke-static {v5, v1}, Lcom/android/billingclient/api/d;->n(Lcom/android/billingclient/api/d;Ljava/util/ArrayList;)V

    iget-boolean v0, p0, Lcom/android/billingclient/api/d$a;->e:Z

    invoke-static {v5, v0}, Lcom/android/billingclient/api/d;->j(Lcom/android/billingclient/api/d;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    if-eqz v0, :cond_12

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/j;->p(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/j;

    move-result-object v0

    goto :goto_a

    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j;->q()Lcom/google/android/gms/internal/play_billing/j;

    move-result-object v0

    :goto_a
    invoke-static {v5, v0}, Lcom/android/billingclient/api/d;->m(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/j;)V

    return-object v5

    :cond_13
    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v4
.end method

.method public b(Z)Lcom/android/billingclient/api/d$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d$a;->e:Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/util/List;)Lcom/android/billingclient/api/d$a;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public f(Lcom/android/billingclient/api/d$c;)Lcom/android/billingclient/api/d$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/android/billingclient/api/d$c;->c(Lcom/android/billingclient/api/d$c;)Lcom/android/billingclient/api/d$c$a;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->f:Lcom/android/billingclient/api/d$c$a;

    return-object p0
.end method
