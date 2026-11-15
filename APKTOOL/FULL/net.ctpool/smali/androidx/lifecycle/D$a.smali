.class Landroidx/lifecycle/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final m:Landroidx/lifecycle/m;

.field final n:Landroidx/lifecycle/h$b;

.field private o:Z


# direct methods
.method constructor <init>(Landroidx/lifecycle/m;Landroidx/lifecycle/h$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/D$a;->o:Z

    iput-object p1, p0, Landroidx/lifecycle/D$a;->m:Landroidx/lifecycle/m;

    iput-object p2, p0, Landroidx/lifecycle/D$a;->n:Landroidx/lifecycle/h$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/D$a;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D$a;->m:Landroidx/lifecycle/m;

    iget-object v1, p0, Landroidx/lifecycle/D$a;->n:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/D$a;->o:Z

    :cond_0
    return-void
.end method
