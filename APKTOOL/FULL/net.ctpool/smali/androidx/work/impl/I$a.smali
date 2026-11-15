.class final Landroidx/work/impl/I$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/I;->c(Landroidx/work/impl/E;Ljava/lang/String;Ll0/u;)Ll0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Ll0/u;

.field final synthetic n:Landroidx/work/impl/E;

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Landroidx/work/impl/o;


# direct methods
.method constructor <init>(Ll0/u;Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/I$a;->m:Ll0/u;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/I$a;->n:Landroidx/work/impl/E;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/work/impl/I$a;->o:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/work/impl/I$a;->p:Landroidx/work/impl/o;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/work/impl/I$a;->m:Ll0/u;

    invoke-static {v0}, Lj5/n;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Landroidx/work/impl/x;

    iget-object v2, p0, Landroidx/work/impl/I$a;->n:Landroidx/work/impl/E;

    iget-object v3, p0, Landroidx/work/impl/I$a;->o:Ljava/lang/String;

    sget-object v4, Ll0/d;->n:Ll0/d;

    invoke-direct {v1, v2, v3, v4, v0}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/E;Ljava/lang/String;Ll0/d;Ljava/util/List;)V

    new-instance v0, Lr0/c;

    iget-object v2, p0, Landroidx/work/impl/I$a;->p:Landroidx/work/impl/o;

    invoke-direct {v0, v1, v2}, Lr0/c;-><init>(Landroidx/work/impl/x;Landroidx/work/impl/o;)V

    invoke-virtual {v0}, Lr0/c;->run()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/work/impl/I$a;->a()V

    sget-object v0, Li5/u;->a:Li5/u;

    return-object v0
.end method
