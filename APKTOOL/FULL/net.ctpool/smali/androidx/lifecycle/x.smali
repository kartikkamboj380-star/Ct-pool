.class public final Landroidx/lifecycle/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/x$a;
    }
.end annotation


# static fields
.field public static final f:Landroidx/lifecycle/x$a;

.field private static final g:[Ljava/lang/Class;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:LY/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 31

    new-instance v0, Landroidx/lifecycle/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/x;->f:Landroidx/lifecycle/x$a;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v16, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    sget-object v21, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v26, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v3, [Z

    const-class v5, [D

    const-class v7, [I

    const-class v9, [J

    const-class v10, Ljava/lang/String;

    const-class v11, [Ljava/lang/String;

    const-class v12, Landroid/os/Binder;

    const-class v13, Landroid/os/Bundle;

    const-class v15, [B

    const-class v17, [C

    const-class v18, Ljava/lang/CharSequence;

    const-class v19, [Ljava/lang/CharSequence;

    const-class v20, Ljava/util/ArrayList;

    const-class v22, [F

    const-class v23, Landroid/os/Parcelable;

    const-class v24, [Landroid/os/Parcelable;

    const-class v25, Ljava/io/Serializable;

    const-class v27, [S

    const-class v28, Landroid/util/SparseArray;

    const-class v29, Landroid/util/Size;

    const-class v30, Landroid/util/SizeF;

    filled-new-array/range {v2 .. v30}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/x;->g:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->d:Ljava/util/Map;

    new-instance v0, Landroidx/lifecycle/w;

    invoke-direct {v0, p0}, Landroidx/lifecycle/w;-><init>(Landroidx/lifecycle/x;)V

    iput-object v0, p0, Landroidx/lifecycle/x;->e:LY/c$c;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 2
    const-string v0, "initialState"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->a:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/x;->b:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/x;->c:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/x;->d:Ljava/util/Map;

    new-instance v1, Landroidx/lifecycle/w;

    invoke-direct {v1, p0}, Landroidx/lifecycle/w;-><init>(Landroidx/lifecycle/x;)V

    iput-object v1, p0, Landroidx/lifecycle/x;->e:LY/c$c;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/x;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/x;->e(Landroidx/lifecycle/x;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()[Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/x;->g:[Ljava/lang/Class;

    return-object v0
.end method

.method public static final c(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/x;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/x;->f:Landroidx/lifecycle/x$a;

    invoke-virtual {v0, p0, p1}, Landroidx/lifecycle/x$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/x;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/lifecycle/x;)Landroid/os/Bundle;
    .locals 5

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/x;->b:Ljava/util/Map;

    invoke-static {v0}, Lj5/F;->q(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY/c$c;

    invoke-interface {v1}, LY/c$c;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroidx/lifecycle/x;->f(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/x;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Landroidx/lifecycle/x;->a:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string p0, "keys"

    invoke-static {p0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object p0

    const-string v0, "values"

    invoke-static {v0, v2}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {p0, v0}, [Li5/l;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/os/d;->a([Li5/l;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d()LY/c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->e:LY/c$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "key"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/x;->f:Landroidx/lifecycle/x$a;

    invoke-virtual {v0, p2}, Landroidx/lifecycle/x$a;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/lifecycle/x;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/lifecycle/q;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/lifecycle/q;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Landroidx/lifecycle/q;->n(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/lifecycle/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/x;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK5/k;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1, p2}, LK5/k;->setValue(Ljava/lang/Object;)V

    :goto_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t put value with type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " into saved state"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
