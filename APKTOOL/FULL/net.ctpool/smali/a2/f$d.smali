.class La2/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:Landroid/view/View;

.field final b:I

.field final c:Z

.field final d:Lcom/facebook/react/uimanager/ViewManager;

.field public e:Lcom/facebook/react/uimanager/W;

.field public f:Lcom/facebook/react/bridge/ReadableMap;

.field public g:Lcom/facebook/react/uimanager/d0;

.field public h:Lcom/facebook/react/fabric/events/EventEmitterWrapper;

.field public i:Ljava/util/Queue;


# direct methods
.method private constructor <init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, La2/f$d;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;Z)V

    return-void
.end method

.method synthetic constructor <init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;La2/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, La2/f$d;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;)V

    return-void
.end method

.method private constructor <init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;Z)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La2/f$d;->e:Lcom/facebook/react/uimanager/W;

    iput-object v0, p0, La2/f$d;->f:Lcom/facebook/react/bridge/ReadableMap;

    iput-object v0, p0, La2/f$d;->g:Lcom/facebook/react/uimanager/d0;

    iput-object v0, p0, La2/f$d;->h:Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    iput-object v0, p0, La2/f$d;->i:Ljava/util/Queue;

    iput p1, p0, La2/f$d;->b:I

    iput-object p2, p0, La2/f$d;->a:Landroid/view/View;

    iput-boolean p4, p0, La2/f$d;->c:Z

    iput-object p3, p0, La2/f$d;->d:Lcom/facebook/react/uimanager/ViewManager;

    return-void
.end method

.method synthetic constructor <init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;ZLa2/h;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, La2/f$d;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;Z)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La2/f$d;->d:Lcom/facebook/react/uimanager/ViewManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "ViewState ["

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v2, p0, La2/f$d;->b:I

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "] - isRoot: "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, La2/f$d;->c:Z

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " - props: "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, La2/f$d;->e:Lcom/facebook/react/uimanager/W;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " - localData: "

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, La2/f$d;->f:Lcom/facebook/react/bridge/ReadableMap;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, " - viewManager: "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, La2/f$d;->d:Lcom/facebook/react/uimanager/ViewManager;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, " - isLayoutOnly: "

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method
