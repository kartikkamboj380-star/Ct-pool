.class final Landroidx/lifecycle/z$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/z;-><init>(LY/c;Landroidx/lifecycle/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroidx/lifecycle/I;


# direct methods
.method constructor <init>(Landroidx/lifecycle/I;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/z$a;->m:Landroidx/lifecycle/I;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/A;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/z$a;->m:Landroidx/lifecycle/I;

    invoke-static {v0}, Landroidx/lifecycle/y;->e(Landroidx/lifecycle/I;)Landroidx/lifecycle/A;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/z$a;->a()Landroidx/lifecycle/A;

    move-result-object v0

    return-object v0
.end method
