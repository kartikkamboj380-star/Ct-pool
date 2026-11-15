.class public Lcom/facebook/hermes/intl/Collator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# instance fields
.field private a:Lcom/facebook/hermes/intl/a$d;

.field private b:Lcom/facebook/hermes/intl/a$c;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Lcom/facebook/hermes/intl/a$b;

.field private g:Lq1/b;

.field private h:Lq1/b;

.field private i:Lcom/facebook/hermes/intl/a;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "default"

    iput-object v0, p0, Lcom/facebook/hermes/intl/Collator;->d:Ljava/lang/String;

    new-instance v0, Lcom/facebook/hermes/intl/h;

    invoke-direct {v0}, Lcom/facebook/hermes/intl/h;-><init>()V

    iput-object v0, p0, Lcom/facebook/hermes/intl/Collator;->i:Lcom/facebook/hermes/intl/a;

    invoke-direct {p0, p1, p2}, Lcom/facebook/hermes/intl/Collator;->a(Ljava/util/List;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/facebook/hermes/intl/Collator;->i:Lcom/facebook/hermes/intl/a;

    iget-object p2, p0, Lcom/facebook/hermes/intl/Collator;->g:Lq1/b;

    invoke-interface {p1, p2}, Lcom/facebook/hermes/intl/a;->c(Lq1/b;)Lcom/facebook/hermes/intl/a;

    move-result-object p1

    iget-boolean p2, p0, Lcom/facebook/hermes/intl/Collator;->e:Z

    invoke-interface {p1, p2}, Lcom/facebook/hermes/intl/a;->e(Z)Lcom/facebook/hermes/intl/a;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/hermes/intl/Collator;->f:Lcom/facebook/hermes/intl/a$b;

    invoke-interface {p1, p2}, Lcom/facebook/hermes/intl/a;->d(Lcom/facebook/hermes/intl/a$b;)Lcom/facebook/hermes/intl/a;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/hermes/intl/Collator;->b:Lcom/facebook/hermes/intl/a$c;

    invoke-interface {p1, p2}, Lcom/facebook/hermes/intl/a;->f(Lcom/facebook/hermes/intl/a$c;)Lcom/facebook/hermes/intl/a;

    move-result-object p1

    iget-boolean p2, p0, Lcom/facebook/hermes/intl/Collator;->c:Z

    invoke-interface {p1, p2}, Lcom/facebook/hermes/intl/a;->g(Z)Lcom/facebook/hermes/intl/a;

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/Map;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/g$a;->n:Lcom/facebook/hermes/intl/g$a;

    sget-object v1, Lq1/a;->e:[Ljava/lang/String;

    const-string v2, "sort"

    const-string v3, "usage"

    invoke-static {p2, v3, v0, v1, v2}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-class v2, Lcom/facebook/hermes/intl/a$d;

    invoke-static {v1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/hermes/intl/g;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcom/facebook/hermes/intl/a$d;

    iput-object v1, p0, Lcom/facebook/hermes/intl/Collator;->a:Lcom/facebook/hermes/intl/a$d;

    invoke-static {}, Lq1/d;->q()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lq1/a;->a:[Ljava/lang/String;

    const-string v3, "best fit"

    const-string v4, "localeMatcher"

    invoke-static {p2, v4, v0, v2, v3}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lq1/d;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lcom/facebook/hermes/intl/g$a;->m:Lcom/facebook/hermes/intl/g$a;

    invoke-static {}, Lq1/d;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lq1/d;->d()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "numeric"

    invoke-static {p2, v5, v2, v3, v4}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lq1/d;->n(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lq1/d;->e(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lq1/d;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    const-string v3, "kn"

    invoke-static {v1, v3, v2}, Lq1/d;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lq1/a;->d:[Ljava/lang/String;

    invoke-static {}, Lq1/d;->d()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "caseFirst"

    invoke-static {p2, v5, v0, v2, v4}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "kf"

    invoke-static {v1, v2, v0}, Lq1/d;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "co"

    filled-new-array {v0, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {p1, v1, v4}, Lcom/facebook/hermes/intl/f;->a(Ljava/util/List;Ljava/lang/Object;Ljava/util/List;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p1}, Lq1/d;->g(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v4, "locale"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq1/b;

    iput-object v1, p0, Lcom/facebook/hermes/intl/Collator;->g:Lq1/b;

    invoke-interface {v1}, Lq1/b;->e()Lq1/b;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/hermes/intl/Collator;->h:Lq1/b;

    invoke-static {p1, v0}, Lq1/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lq1/d;->j(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v1, "default"

    invoke-static {v1}, Lq1/d;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    :cond_1
    invoke-static {v1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/hermes/intl/Collator;->d:Ljava/lang/String;

    invoke-static {p1, v3}, Lq1/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lq1/d;->j(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/facebook/hermes/intl/Collator;->e:Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :goto_1
    invoke-static {p1, v2}, Lq1/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lq1/d;->j(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p1, "false"

    invoke-static {p1}, Lq1/d;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    :cond_3
    const-class v1, Lcom/facebook/hermes/intl/a$b;

    invoke-static {p1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/facebook/hermes/intl/g;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lcom/facebook/hermes/intl/a$b;

    iput-object p1, p0, Lcom/facebook/hermes/intl/Collator;->f:Lcom/facebook/hermes/intl/a$b;

    iget-object p1, p0, Lcom/facebook/hermes/intl/Collator;->a:Lcom/facebook/hermes/intl/a$d;

    sget-object v1, Lcom/facebook/hermes/intl/a$d;->n:Lcom/facebook/hermes/intl/a$d;

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lcom/facebook/hermes/intl/Collator;->g:Lq1/b;

    const-string v1, "collation"

    invoke-interface {p1, v1}, Lq1/b;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lq1/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    const-string p1, "search"

    invoke-static {p1}, Lq1/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/facebook/hermes/intl/Collator;->g:Lq1/b;

    invoke-interface {p1, v0, v1}, Lq1/b;->g(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_5
    sget-object p1, Lcom/facebook/hermes/intl/g$a;->n:Lcom/facebook/hermes/intl/g$a;

    sget-object v0, Lq1/a;->c:[Ljava/lang/String;

    invoke-static {}, Lq1/d;->d()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "sensitivity"

    invoke-static {p2, v2, p1, v0, v1}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lq1/d;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-class v0, Lcom/facebook/hermes/intl/a$c;

    invoke-static {p1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/facebook/hermes/intl/g;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lcom/facebook/hermes/intl/a$c;

    :goto_3
    iput-object p1, p0, Lcom/facebook/hermes/intl/Collator;->b:Lcom/facebook/hermes/intl/a$c;

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lcom/facebook/hermes/intl/Collator;->a:Lcom/facebook/hermes/intl/a$d;

    sget-object v0, Lcom/facebook/hermes/intl/a$d;->m:Lcom/facebook/hermes/intl/a$d;

    if-ne p1, v0, :cond_7

    sget-object p1, Lcom/facebook/hermes/intl/a$c;->p:Lcom/facebook/hermes/intl/a$c;

    goto :goto_3

    :cond_7
    sget-object p1, Lcom/facebook/hermes/intl/a$c;->q:Lcom/facebook/hermes/intl/a$c;

    goto :goto_3

    :goto_4
    sget-object p1, Lcom/facebook/hermes/intl/g$a;->m:Lcom/facebook/hermes/intl/g$a;

    invoke-static {}, Lq1/d;->d()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "ignorePunctuation"

    invoke-static {p2, v2, p1, v0, v1}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lq1/d;->e(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/hermes/intl/Collator;->c:Z

    return-void
.end method

.method public static supportedLocalesOf(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/facebook/hermes/intl/g$a;->n:Lcom/facebook/hermes/intl/g$a;

    sget-object v1, Lq1/a;->a:[Ljava/lang/String;

    const-string v2, "localeMatcher"

    const-string v3, "best fit"

    invoke-static {p1, v2, v0, v1, v3}, Lcom/facebook/hermes/intl/g;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/g$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-static {p0}, Lcom/facebook/hermes/intl/e;->d([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-static {p0}, Lcom/facebook/hermes/intl/e;->h([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public compare(Ljava/lang/String;Ljava/lang/String;)D
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/hermes/intl/Collator;->i:Lcom/facebook/hermes/intl/a;

    invoke-interface {v0, p1, p2}, Lcom/facebook/hermes/intl/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    int-to-double p1, p1

    return-wide p1
.end method

.method public resolvedOptions()Ljava/util/Map;
    .locals 4
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lcom/facebook/hermes/intl/Collator;->h:Lq1/b;

    invoke-interface {v1}, Lq1/b;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-kn-true"

    const-string v3, "-kn"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "locale"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/hermes/intl/Collator;->a:Lcom/facebook/hermes/intl/a$d;

    invoke-virtual {v1}, Lcom/facebook/hermes/intl/a$d;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "usage"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/hermes/intl/Collator;->b:Lcom/facebook/hermes/intl/a$c;

    sget-object v2, Lcom/facebook/hermes/intl/a$c;->q:Lcom/facebook/hermes/intl/a$c;

    const-string v3, "sensitivity"

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/hermes/intl/Collator;->i:Lcom/facebook/hermes/intl/a;

    invoke-interface {v1}, Lcom/facebook/hermes/intl/a;->b()Lcom/facebook/hermes/intl/a$c;

    move-result-object v1

    :cond_0
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/a$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/facebook/hermes/intl/Collator;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "ignorePunctuation"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "collation"

    iget-object v2, p0, Lcom/facebook/hermes/intl/Collator;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/facebook/hermes/intl/Collator;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "numeric"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/hermes/intl/Collator;->f:Lcom/facebook/hermes/intl/a$b;

    invoke-virtual {v1}, Lcom/facebook/hermes/intl/a$b;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "caseFirst"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
