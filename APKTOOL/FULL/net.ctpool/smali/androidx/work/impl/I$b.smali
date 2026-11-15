.class final Landroidx/work/impl/I$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/I;->f(Landroidx/work/impl/r;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lq0/u;Ljava/util/Set;)Ll0/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Landroidx/work/impl/I$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/work/impl/I$b;

    invoke-direct {v0}, Landroidx/work/impl/I$b;-><init>()V

    sput-object v0, Landroidx/work/impl/I$b;->m:Landroidx/work/impl/I$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/u;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "spec"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lq0/u;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-string p1, "Periodic"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p1, "OneTime"

    .line 16
    .line 17
    :goto_0
    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq0/u;

    invoke-virtual {p0, p1}, Landroidx/work/impl/I$b;->a(Lq0/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
