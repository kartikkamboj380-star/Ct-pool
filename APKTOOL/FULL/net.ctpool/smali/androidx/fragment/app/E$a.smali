.class final Landroidx/fragment/app/E$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Landroidx/fragment/app/Fragment;

.field c:Z

.field d:I

.field e:I

.field f:I

.field g:I

.field h:Landroidx/lifecycle/h$c;

.field i:Landroidx/lifecycle/h$c;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/Fragment;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/E$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/E$a;->b:Landroidx/fragment/app/Fragment;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/E$a;->c:Z

    sget-object p1, Landroidx/lifecycle/h$c;->q:Landroidx/lifecycle/h$c;

    iput-object p1, p0, Landroidx/fragment/app/E$a;->h:Landroidx/lifecycle/h$c;

    iput-object p1, p0, Landroidx/fragment/app/E$a;->i:Landroidx/lifecycle/h$c;

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/Fragment;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/E$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/E$a;->b:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Landroidx/fragment/app/E$a;->c:Z

    sget-object p1, Landroidx/lifecycle/h$c;->q:Landroidx/lifecycle/h$c;

    iput-object p1, p0, Landroidx/fragment/app/E$a;->h:Landroidx/lifecycle/h$c;

    iput-object p1, p0, Landroidx/fragment/app/E$a;->i:Landroidx/lifecycle/h$c;

    return-void
.end method
